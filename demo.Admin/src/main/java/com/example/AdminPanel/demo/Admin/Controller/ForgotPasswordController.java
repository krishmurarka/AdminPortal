package com.example.AdminPanel.demo.Admin.Controller;

import com.example.AdminPanel.demo.Admin.Config.Utility;
import com.example.AdminPanel.demo.Admin.Model.User;
import com.example.AdminPanel.demo.Admin.Service.UserService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@RestController
public class ForgotPasswordController {

    @Autowired
    private UserService userService;
    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/forgot-password")
    public String showForgotPasswordForm(Model model) {
        model.addAttribute("page", "Forgot Password");
        return "forgot-password-form";
    }

    @PostMapping("/forgot-password")
    @ResponseBody
    public String processForgotPasswordForm(HttpServletRequest request) throws MessagingException, UnsupportedEncodingException {

        String email = request.getParameter("email");
        String token = RandomString.make(45);
        System.out.println("Email received = " + email);
        System.out.println("Token = " + token);

        userService.updateResetPasswordToken(token, email);

        //then generate resetPassWord Link
        String resetPasswordLink = Utility.getSiteURL(request) + "/reset_password?token=" + token;
        System.out.println(resetPasswordLink);

        // and send email
        sendEmail(email, resetPasswordLink);
        System.out.println("Email received = " + email);
        System.out.println("Token = " + token);
        return "forgot-password-form";
    }

    private void sendEmail(String email, String resetPasswordLink) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom("singhh3010@gmail.com", "JobEase");
        helper.setTo(email);

        String subject = "Here's the link to reset your password";
        String content = "<p>Hello, </p>" +
                "<p>You have requested to reset your password.</p>" +
                "<p>Click the link below to change your password:</p>" +
                "<p><b><a href =\"" + resetPasswordLink + "\">Change my password</a><b></p>" +
                "<p>Ignore this email if you do remember your password , or you have not made the request.</p>";

        helper.setSubject(subject);
        helper.setText(content, true);

        mailSender.send(message);
    }

    @GetMapping("/reset_password")
    public String showResetPasswordForm(@Param(value = "token") String token) {

        User user = userService.get(token);
        if (user == null) {
            System.out.println("User not Found , Invalid Token");
        }
        return "reset_password_form";
    }

    @PostMapping("/reset_password")
    public String processResetPassword(HttpServletRequest request) {

        String token = request.getParameter("token");
        String password = request.getParameter("password");

        User user = userService.get(token);
        if (user == null) {
            System.out.println("Invalid Token there");
        }else{
            userService.updatePassword(user,password);
        }
        return "reset_password_token";
    }
}
