package Javamid2.collection.something;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    private final ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        init();
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    private void init() {

        for (int i = 0; i < 13; i++) {
            for (Unit unit : Unit.values()) {
                deck.add(new Card(i, unit));
            }
        }
    }

    public Card drawCard() {
        return deck.remove(0);
    }
}
