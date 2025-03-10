package br.dev.paulowolfgang.java_8.case_study.cards;

/**
 *
 * @author Paulo Silva
 */
public class DeckOfCardsTest {
    public static void main(String[] args) {
        
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        
        for (int i = 0; i <= 52; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());
        
            if(i % 4 == 0){
                System.out.println();
            }
        }
    }
}
