package de.nhausleitner.chess.domain.model.figuren;

public class Pferd extends Figur{
    public Pferd(String farbe, int x, int y) {
        super(farbe, x, y);
        bildURL = farbe.equals("weiß") ? "/weißesPferd.png" : "/schwarzesPferd.png";
    }

    @Override
    public boolean zug(String ziel) {
        return false;
    }
}
