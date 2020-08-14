package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @GetMapping("/ ")
    public String convert(@RequestParam int vnd, Model modle){
        int DOla;
        DOla=vnd/20;

        modle.addAttribute("DOla",DOla);
        return "index";
    }
}
