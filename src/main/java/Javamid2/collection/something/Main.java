package Javamid2.collection.something;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }
        player1.showHand();
        player2.showHand();
        Player winner = winner(player1,player2);
        if (winner != null) {
            System.out.println(winner+"승리");
        }
        else {
            System.out.println("무승부");
        }
    }

    private static Player winner(Player player1, Player player2) {
        int firstsum = player1.rankSum();
        int secondsum = player2.rankSum();
        if (firstsum > secondsum) {
            return player1;
        }
        return player2;
    }

}
