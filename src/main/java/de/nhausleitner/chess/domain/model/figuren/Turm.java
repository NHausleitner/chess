package de.nhausleitner.chess.domain.model.figuren;

public class Turm extends Figur{
    public Turm(String farbe, int x, int y) {
        super(farbe, x, y);
        bildURL = farbe.equals("weiß") ? "/weißerTurm.png" : "/schwarzerTurm.png";
    }

    @Override
    public boolean zug(String ziel) {
        return false;
    }
}
