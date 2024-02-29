package de.nhausleitner.chess.adapter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    public WebController(){

    }

    @GetMapping("/")
    public String main(){
        return "main.html";
    }



}
