package de.nhausleitner.chess.domain.model.figuren;

public class König extends Figur{
    public König(String farbe, int x, int y) {
        super(farbe, x, y);
        bildURL = farbe.equals("weiß") ? "/weißerKönig.png" : "/schwarzerKönig.png";
    }

    @Override
    public boolean zug(String ziel) {
        return false;
    }
}
