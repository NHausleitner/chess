package de.nhausleitner.chess.adapter.web;

import de.nhausleitner.chess.application.service.Spielleiter;
import de.nhausleitner.chess.domain.model.Spiel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    Spielleiter spielleiter;

    public WebController(Spielleiter spielleiter){
        this.spielleiter = spielleiter;
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
    public String spielGegenFreundErstellen(Integer startzeit, Integer inkrement, Model model){
        Spiel spiel = spielleiter.spielErstellen("freund", startzeit, inkrement);
        spiel.standardSchachInitialisieren();
        model.addAttribute("brett", spiel.getBrett().getRepräsentation());
        return "/spiel.html";
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
