package com.example.AdminPanel.demo.Admin.Controller;


import com.example.AdminPanel.demo.Admin.Config.JwtUtil;
import com.example.AdminPanel.demo.Admin.Model.JwtRequests;
import com.example.AdminPanel.demo.Admin.Model.JwtResponse;
import com.example.AdminPanel.demo.Admin.Service.Implementation.UserDetailSecurityImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserDetailSecurityImplementation userDetailSecurityImplementation;


    //generate-token

    @PostMapping("/generate-token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequests jwtRequests) throws Exception {
        try {
            authenticate(jwtRequests.getUsername(), jwtRequests.getPassword());
        } catch (UsernameNotFoundException e) {
            e.printStackTrace();
            throw new Exception("User not found");
        }
        //authenticated
        UserDetails userDetails = this.userDetailSecurityImplementation.loadUserByUsername(jwtRequests.getUsername());
        String token = this.jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("User Disabled" + e.getMessage());
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid credentials" + e.getMessage());
        }
    }
}
