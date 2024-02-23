package com.example.potluck.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi") //url요청 접수
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "현서");
        return "greeting"; //greeting.html 파일 변환
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", "핀");
        return "goodbye";
    }
}
