package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @GetMapping("/Convert")
    public String convert(){
        return "input";
    }




    @PostMapping("/Convert")
    public String convertPost(@RequestParam int Dola, Model modle){
        int vnd;
        vnd=Dola*20;

        modle.addAttribute("vnd",vnd);
        return "index";
    }
}
