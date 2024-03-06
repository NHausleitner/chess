package de.nhausleitner.chess.application.service;

import de.nhausleitner.chess.domain.model.Spiel;
import org.springframework.stereotype.Service;

@Service
public class Spielleiter {

    public Spiel spielErstellen(String typ, int startzeit, int inkrement) {
        return new Spiel(typ, startzeit, inkrement);
    }
}
