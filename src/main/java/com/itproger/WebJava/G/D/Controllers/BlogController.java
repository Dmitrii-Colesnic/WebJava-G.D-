package com.itproger.WebJava.G.D.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    private String blogMain(Model model) {
        return "BlogMain";
    }
}