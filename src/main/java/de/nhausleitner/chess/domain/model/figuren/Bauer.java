package de.nhausleitner.chess.domain.model.figuren;

public class Bauer extends Figur{

    public Bauer(String farbe, int x, int y) {
        super(farbe, x, y);
        bildURL = farbe.equals("weiß") ? "/weißerBauer.png" : "/schwarzerBauer.png";
    }


    @Override
    public boolean zug(String ziel) {

        return false;
    }


}
