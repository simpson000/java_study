package Javamid2.collection.something;

public class Card implements Comparable<Card> {
    private final int rank;
    private final Unit unit;

    public Card(int rank, Unit unit) {
        this.rank = rank;
        this.unit = unit;
    }
    public int getRank() {
        return rank;
    }
    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return rank + "(" + unit.getIcon() + ")";
    }

    @Override
    public int compareTo(Card o) {
        if (this.rank!=o.rank){
            return Integer.compare(this.rank, o.rank);
        }
        else{
            return this.unit.compareTo(o.unit);
        }
    }
}
