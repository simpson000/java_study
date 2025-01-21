package Javamid2.collection.compare;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }
    public void drawCard(Deck deck) {
        cards.add(deck.drawCard());
    }

    public int numberSum() {
        int value = 0;
        for (Card card : cards) {
            value += card.getNumber();
        }
        return value;
    }

    public void showHand() {

        cards.sort(null);
        System.out.println("Player " + name + " has " + cards +"sum:"+numberSum());
    }

    public String getName() {
        return name;
    }
}
