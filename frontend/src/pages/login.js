
import React, { Component } from "react";
import "./login.css"
export class login extends Component {
  render() {
    return (
        <div id="content" class="site-content">
            <div class="ast-container">


                <div id="primary" class="content-area primary">


                    <main id="main" class="site-main">
                        <article class="post-2 page type-page status-publish ast-article-single" id="post-2" itemtype="https://schema.org/CreativeWork" itemscope="itemscope">
                            <header class="entry-header ast-header-without-markup"></header>
      <div class="entry-content clear" itemprop="text">
        <div
          data-elementor-type="wp-page"
          data-elementor-id="2"
          class="elementor elementor-2"
          data-elementor-settings="[]"
        >
          <div class="elementor-section-wrap">
            <section
              class="elementor-section elementor-top-section elementor-element elementor-element-dca09e1 elementor-section-boxed elementor-section-height-default elementor-section-height-default"
              data-id="dca09e1"
              data-element_type="section"
            >
              <div class="elementor-container elementor-column-gap-default">
                <div
                  class="elementor-column elementor-col-100 elementor-top-column elementor-element elementor-element-0c880aa"
                  data-id="0c880aa"
                  data-element_type="column"
                >
                  <div class="elementor-widget-wrap elementor-element-populated">
                    <div
                      class="elementor-element elementor-element-613daf6 elementor-widget elementor-widget-heading"
                      data-id="613daf6"
                      data-element_type="widget"
                      data-widget_type="heading.default"
                    >
                      <div class="elementor-widget-container">
                        <h2 class="elementor-heading-title elementor-size-default">
                          LOGIN
                        </h2>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </section>
            <section
              className="elementor-section elementor-top-section elementor-element elementor-element-80add9d elementor-section-boxed elementor-section-height-default elementor-section-height-default"
              data-id="80add9d"
              data-element_type="section"
            >
              <div className="elementor-container elementor-column-gap-default">
                <div
                  className="elementor-column elementor-col-100 elementor-top-column elementor-element elementor-element-13c8c12"
                  data-id="13c8c12"
                  data-element_type="column"
                >
                  <div className="elementor-widget-wrap elementor-element-populated">
                    <div
                      className="elementor-element elementor-element-6c4afff elementor-widget elementor-widget-eael-login-register"
                      data-id="6c4afff"
                      data-element_type="widget"
                      data-widget_type="eael-login-register.default"
                    >
                      <div className="elementor-widget-container">
                        <div
                          className="eael-login-registration-wrapper "
                          data-is-ajax=""
                          data-widget-id="6c4afff"
                          data-recaptcha-sitekey=""
                          data-redirect-to=""
                        >
                          <section
                            id="eael-login-form-wrapper"
                            className=""
                            data-recaptcha-theme="light"
                            data-recaptcha-size="normal"
                          >
                            <div className="eael-login-form-wrapper eael-lr-form-wrapper style-2 ">
                              <div className="lr-form-wrapper">
                                <form
                                  className="eael-login-form eael-lr-form"
                                  id="eael-login-form"
                                  method="post"
                                >
                                  <div class="eael-lr-form-group">
                                    <label
                                      htmlFor="eael-user-login"
                                      className="eael-field-label">
                                      Username or Email Address
                                    </label>
                                    <input
                                      type="email"
                                      placeholder="Username"
                                      name="eael-user-login"
                                      id="eael-user-login"
                                      className="eael-lr-form-control"
                                      aria-describedby="emailHelp"
                                      required
                                    />
                                  </div>
                                  <div class="eael-lr-form-group">
                                    <label
                                      for="eael-user-password"
                                      className="eael-field-label"
                                    >
                                      Password
                                    </label>
                                    <div class="eael-lr-password-wrapper">
                                       
                                      <input type="password" name="eael-user-password" className="eael-lr-form-control" id="eael-user-password" placeholder="Password" required/>
                                      <button
                                        type="button"
                                        id="wp-hide-pw"
                                        class="wp-hide-pw hide-if-no-js"
                                        aria-label="Show password"
                                      >
                                        <span
                                          class="dashicons dashicons-visibility"
                                          aria-hidden="true"
                                        ></span>
                                      </button>
                                    </div>
                                  </div>
                                  <div class="eael-forever-forget eael-lr-form-group">
                                    <p class="forget-menot">
                                      <input
                                        name="eael-rememberme"
                                        type="checkbox"
                                        id="rememberme"
                                        class="remember-me"
                                        value="forever"
                                        style={{
                                            color: "blue",
                                        }}
                                      />
                                      <label
                                        for="rememberme"
                                        class="eael-checkbox-label rememberme"
                                      >
                                        Remember Me
                                      </label>
                                    </p>
                                    <p className="forget-pass">
                                      <a href="https://jobeae2-966ccf.ingress-baronn.easywp.com/wp-login.php?action=lostpassword">
                                        Forgot password?
                                      </a>
                                    </p>
                                  </div>
                                  <div className="eael-lr-footer">
                                    <input
                                      type="submit"
                                      name="eael-login-submit"
                                      id="eael-login-submit"
                                      className="g-recaptcha eael-lr-btn eael-lr-btn-block "
                                      style={{
                                        backgroundColor: "blue",
                                        color: "green"
                                      }}
                                      value="Log In"
                                    />
                                  </div>
                                  <div className="eael-form-validation-container"></div>
                                  <input
                                    type="hidden"
                                    id="eael-login-nonce"
                                    name="eael-login-nonce"
                                    value="92109093a2"
                                  />
                                  <input
                                    type="hidden"
                                    name="_wp_http_referer"
                                    value="/sample-page/"
                                  />{" "}
                                  <input
                                    type="hidden"
                                    name="page_id"
                                    value="2"
                                  />
                                  <input
                                    type="hidden"
                                    name="widget_id"
                                    value="6c4afff"
                                  />
                                </form>
                              </div>
                            </div>
                          </section>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </section>
          </div>
        </div>
      </div>
    {/* </div> */}
    </article>
    </main>
    </div>
</div>
</div>
);
  }
}

export default login;
