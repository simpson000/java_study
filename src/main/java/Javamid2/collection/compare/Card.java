package Javamid2.collection.compare;

public class Card implements Comparable<Card> {
    private final int number;
    private final Unit unit;

    public Card(int number, Unit unit) {
        this.number = number;
        this.unit = unit;
    }
    public int getNumber() {
        return number;
    }
    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return number + "(" + unit.getIcon() + ")";
    }

    @Override
    public int compareTo(Card card) {
        if (this.number != card.number) {
            return Integer.compare(this.number, card.number);
        }
        else {
            return this.unit.compareTo(card.unit);
        }
    }
}
