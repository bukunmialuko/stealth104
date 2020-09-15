package com.example.stealth104;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "student";
    }

    // new controller method to read form data and add
    // data to the model

    public String letsShoutDude(HttpServletRequest request, Model model ){
        return "helloworld";
    }
}
