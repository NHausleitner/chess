package de.nhausleitner.chess.domain.model;


import de.nhausleitner.chess.domain.model.figuren.*;

public class Brett {

    private final Figur[][] brett = new Figur[8][8];

    public void standardSchachInitialisieren() {
        String[][] standardBrett ={
                {"r","n","b","q","k","b","n","r"},
                {"p","p","p","p","p","p","p","p"},
                {" "," "," "," "," "," "," "," "},
                {" "," "," "," "," "," "," "," "},
                {" "," "," "," "," "," "," "," "},
                {" "," "," "," "," "," "," "," "},
                {"P","P","P","P","P","P","P","P"},
                {"R","N","B","Q","K","B","N","R"}
        };
        for (int i=0; i<64; i++){
            switch (standardBrett[i/8][i%8]){
                case "P": brett[i/8][i%8] = new Bauer("weiß"); break;
                case "R": brett[i/8][i%8] = new Turm("weiß"); break;
                case "N": brett[i/8][i%8] = new Pferd("weiß"); break;
                case "B": brett[i/8][i%8] = new Läufer("weiß"); break;
                case "Q": brett[i/8][i%8] = new Königin("weiß"); break;
                case "K": brett[i/8][i%8] = new König("weiß"); break;
                case "p": brett[i/8][i%8] = new Bauer("schwarz"); break;
                case "r": brett[i/8][i%8] = new Turm("schwarz"); break;
                case "n": brett[i/8][i%8] = new Pferd("schwarz"); break;
                case "b": brett[i/8][i%8] = new Läufer("schwarz"); break;
                case "q": brett[i/8][i%8] = new Königin("schwarz"); break;
                case "k": brett[i/8][i%8] = new König("schwarz"); break;
            }
        }
    }


}
