package Javamid2.collection.compare;

public enum Unit {
    SPADE("♠"),  // 스페이드(♠)
    HEART("♥"),// 하트(♥)
    DIAMOND("♦"),// 다이아몬드(♦)
    CLUB("♣");// 클로버(♣)
    private String icon;

    Unit(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }
}
