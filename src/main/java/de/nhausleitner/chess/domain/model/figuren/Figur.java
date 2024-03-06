package de.nhausleitner.chess.domain.model.figuren;

public abstract class Figur {

    private final String farbe;

    protected Figur(String farbe) {
        this.farbe = farbe;
    }

    public abstract boolean zug(String ziel);
}
