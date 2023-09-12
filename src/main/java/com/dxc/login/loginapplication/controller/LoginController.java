package com.dxc.login.loginapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/LoginPage")
    public String LoginPage() {

        return "index";
    }

    // add request mapping for /access-denied
    @GetMapping("/access-denied")
    public String showaccessdeniedPage() {

        return "access-denied";
    }
}
