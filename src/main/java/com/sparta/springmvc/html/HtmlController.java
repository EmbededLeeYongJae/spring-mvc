package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    // 타임리프끄고
    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }

    //타임리프키고 redirect로 경로를 다시 접속
    @GetMapping("/html/redirect")
    public String htmlStatic(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates(){
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits",visitCount);
        return "hello-visit";

    }

}
