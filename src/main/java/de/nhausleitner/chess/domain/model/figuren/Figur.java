package de.nhausleitner.chess.domain.model.figuren;

import java.util.List;

public abstract class Figur {

    private final String farbe;
    private final int x;
    private final int y;
    private final String position;
    public String bildURL;

    protected Figur(String farbe, int x, int y) {
        this.farbe = farbe;
        this.x = x;
        this.y = y;
        this.position = inStringform(x, y);
    }

    private String inStringform(int x, int y) {
        char[] spalten = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        return spalten[y] + String.valueOf(x+1);
    }

    private int stringZuXKoordinate(String position){
        return position.charAt(1) - 1;
    }

    private int stringZuYKoordinate(String position){
        List<Character> spalten = List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H');
        return spalten.indexOf(position.charAt(0));
    }

    public abstract boolean zug(String ziel);
}
