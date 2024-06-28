//package ru.kata.spring.boot_security.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//public class LoginController {
//
//    private final AuthenticationManager authenticationManager;
//
//    @Autowired
//    public LoginController(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @PostMapping("/login")
//    public String performLogin(
//            @RequestParam("email") String email,
//            @RequestParam("password") String password,
//            HttpServletRequest request) {
//
//        try {
//            Authentication authRequest = new UsernamePasswordAuthenticationToken(email, password);
//            Authentication authResult = authenticationManager.authenticate(authRequest);
//
//            SecurityContextHolder.getContext().setAuthentication(authResult);
//            return "redirect:/"; // Убедитесь, что это соответствует вашей логике навигации
//        } catch (AuthenticationException e) {
//            return "redirect:/login?error";
//        }
//    }
//}
