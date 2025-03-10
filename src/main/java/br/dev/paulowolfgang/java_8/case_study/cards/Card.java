package br.dev.paulowolfgang.java_8.case_study.cards;

/**
 *
 * @author Paulo Silva
 */
public class Card {
    private final String face;
    private final String suit;
    
    public Card(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }
    
    public String toString(){
        return face + " of " + suit;
    }
}
