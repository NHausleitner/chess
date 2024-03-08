package de.nhausleitner.chess.domain.model;


import de.nhausleitner.chess.domain.model.figuren.*;

public class Brett {

    public Figur[][] getRepräsentation() {
        return repräsentation;
    }

    private final Figur[][] repräsentation = new Figur[8][8];

    public void standardSchachInitialisieren() {
        String[][] standardBrett ={
                {"r1","n1","b1","q","k","b2","n2","r2"},
                {"p1","p2","p3","p4","p5","p6","p7","p8"},
                {" "," "," "," "," "," "," "," "},
                {" "," "," "," "," "," "," "," "},
                {" "," "," "," "," "," "," "," "},
                {" "," "," "," "," "," "," "," "},
                {"P1","P2","P3","P4","P5","P6","P7","P8"},
                {"R1","N1","B1","Q","K","B2","N2","R2"}
        };
        for (int i=0; i<64; i++){
            switch (standardBrett[i/8][i%8]){
                case "P1": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 0); break;
                case "P2": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 1); break;
                case "P3": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 2); break;
                case "P4": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 3); break;
                case "P5": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 4); break;
                case "P6": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 5); break;
                case "P7": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 6); break;
                case "P8": repräsentation[i/8][i%8] = new Bauer("weiß", 6, 7); break;
                case "R1": repräsentation[i/8][i%8] = new Turm("weiß", 7, 0); break;
                case "R2": repräsentation[i/8][i%8] = new Turm("weiß", 7, 7); break;
                case "N1": repräsentation[i/8][i%8] = new Pferd("weiß", 7, 1); break;
                case "N2": repräsentation[i/8][i%8] = new Pferd("weiß", 7, 6); break;
                case "B1": repräsentation[i/8][i%8] = new Läufer("weiß", 7, 2); break;
                case "B2": repräsentation[i/8][i%8] = new Läufer("weiß", 7, 5); break;
                case "Q": repräsentation[i/8][i%8] = new Königin("weiß", 7, 3); break;
                case "K": repräsentation[i/8][i%8] = new König("weiß", 7, 4); break;
                case "p1": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 0); break;
                case "p2": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 1); break;
                case "p3": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 2); break;
                case "p4": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 3); break;
                case "p5": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 4); break;
                case "p6": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 5); break;
                case "p7": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 6); break;
                case "p8": repräsentation[i/8][i%8] = new Bauer("schwarz", 1, 7); break;
                case "r1": repräsentation[i/8][i%8] = new Turm("schwarz", 0, 0); break;
                case "r2": repräsentation[i/8][i%8] = new Turm("schwarz", 0, 7); break;
                case "n1": repräsentation[i/8][i%8] = new Pferd("schwarz", 0, 1); break;
                case "n2": repräsentation[i/8][i%8] = new Pferd("schwarz", 0, 6); break;
                case "b1": repräsentation[i/8][i%8] = new Läufer("schwarz", 0, 2); break;
                case "b2": repräsentation[i/8][i%8] = new Läufer("schwarz", 0, 5); break;
                case "q": repräsentation[i/8][i%8] = new Königin("schwarz", 0, 3); break;
                case "k": repräsentation[i/8][i%8] = new König("schwarz",0, 4); break;
            }
        }
    }


}
