package Javamid2.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements Comparable<Deck> {

    private List<Card> deck = new ArrayList<Card>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {

        for (int i = 0; i < 13; i++) {
            for (Unit unit : Unit.values()) {
                deck.add(new Card(i, unit));
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        return deck.remove(0);
    }

    @Override
    public int compareTo(Deck o) {
        return 0;
    }
}
