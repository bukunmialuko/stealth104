package com.example.stealth104;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model ){
        // read the request parameter from the html form
        String theName = request.getParameter("studentName");

        // convert the data to all Cap
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "student";
    }
}
