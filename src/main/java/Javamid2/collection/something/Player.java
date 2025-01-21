package Javamid2.collection.something;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        cards = new ArrayList<>();
    }
    public void drawCard(Deck deck) {
        cards.add(deck.drawCard());
    }

    public void showHand() {
        Collections.sort(cards);
        System.out.println(name + "의 카드: " + cards + ", 합계: " + rankSum());
    }

    public int rankSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getRank();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "'" + name+"'";
    }
}


