package com.example.securitydemo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }

    @Secured({ "ROLE_ADMIN" })
    @GetMapping("/admin/hi")
    public String adminHi() {
        return "hi";
    }

}
