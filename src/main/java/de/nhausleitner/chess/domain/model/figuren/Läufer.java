package de.nhausleitner.chess.domain.model.figuren;

public class Läufer extends Figur{
    public Läufer(String farbe, int x, int y) {
        super(farbe, x, y);
        bildURL = farbe.equals("weiß") ? "/weißerLäufer.png" : "/schwarzerLäufer.png";
    }

    @Override
    public boolean zug(String ziel) {
        return false;
    }
}
