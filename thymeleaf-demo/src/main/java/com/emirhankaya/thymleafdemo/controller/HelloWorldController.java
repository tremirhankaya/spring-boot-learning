package com.emirhankaya.thymleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersion2")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String theName = request.getParameter("firstName");
        theName = theName.toUpperCase();
        model.addAttribute("theName", theName);
        return "helloworld01";
    }

}
