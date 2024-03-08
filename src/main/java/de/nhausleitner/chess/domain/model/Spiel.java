package de.nhausleitner.chess.domain.model;

public class Spiel {
    private final String typ;
    private final int startzeit;
    private final int inkrement;
    private Partie partie = new Partie();
    private Spieler weiß = new Spieler(0);
    private Spieler schwarz = new Spieler(0);
    private Brett brett = new Brett();

    public Spiel(String typ, int startzeit, int inkrement){
        this.typ = typ;
        this.startzeit = startzeit;
        this.inkrement = inkrement;
    }

    public void standardSchachInitialisieren(){
        brett.standardSchachInitialisieren();
    }

    public Brett getBrett() {
        return brett;
    }


}
