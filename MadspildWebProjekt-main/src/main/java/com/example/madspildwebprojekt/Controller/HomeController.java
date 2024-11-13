package com.example.madspildwebprojekt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/forbruger")
    public String forbruger() {
        return "home/forbruger";
    }

    @GetMapping("/organisation")
    public String organisation() {
        return "home/organisation";
    }

    @GetMapping("/virksomhed")
    public String virksomhed() {
        return "home/virksomhed";
    }

    @GetMapping("/info")
    public String info() {
        return "home/info";
    }

    @GetMapping("/searchErrorPage")
    public String searchErrorPage() {
        return "home/searchErrorPage";
    }

    @GetMapping("/submit-comment")
    public String submitComment() {
        return "home/submit-comment";
    }
}