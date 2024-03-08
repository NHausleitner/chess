package de.nhausleitner.chess.domain.model.figuren;

public class Königin extends Figur{
    public Königin(String farbe, int x, int y) {
        super(farbe, x, y);
        bildURL = farbe.equals("weiß") ? "/weißeKönigin.png" : "/schwarzeKönigin.png";
    }

    @Override
    public boolean zug(String ziel) {
        return false;
    }
}
