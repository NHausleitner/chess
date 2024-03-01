package de.nhausleitner.chess.adapter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    public WebController(){
    }

    @GetMapping("/")
    public String main(){
        return "main.html";
    }

    @GetMapping("/neuesSpiel/freund")
    public String neuesSpielGegenFreund(){
        return "spielFreund.html";
    }

    @PostMapping("/neuesSpiel/freund")
    public String spielGegenFreundErstellen(String startzeit, String inkrement){
        // new Game(startzeit, inkrement)
        return "redirect:/spiel";
    }

    @GetMapping("/neuesSpiel/karl")
    public String neuesSpielGegenKarl(){
        return "spielKarl.html";
    }

    @GetMapping("/neuesSpiel/stockfish")
    public String neuesSpielGegenStockfish(){
        return "spielStockfish.html";
    }





}
