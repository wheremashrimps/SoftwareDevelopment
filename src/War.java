import java.util.ArrayList;

public class War extends Game {

    private DeckOfCards deck;
    private ArrayList<Player> players;

    public War(String name) {
        super(name);
        this.deck = new DeckOfCards(52);
        this.players = new ArrayList<Player>();
    }

    @Override
    public void play() {
        this.deck.shuffle();
        for (int i = 0; i < 2; i++) {
            this.players.add(new Player("Player " + (i + 1)));
        }
        while (this.deck.getSize() > 0) {
            for (Player player : this.players) {
                player.addCard(this.deck.remove(this.deck.getCards().get(0)));
            }
        }
        for (Player player : this.players) {
            System.out.println(player.getName() + ": " + player.getHand());
        }
        runGame();

    }

    @Override
    public void declareWinner() {
        Player player1 = this.players.get(0);
        Player player2 = this.players.get(1);
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public void runGame() {
        while (this.players.get(0).getHand().size() > 0 && this.players.get(1).getHand().size() > 0) {
            Player player1 = this.players.get(0);
            Player player2 = this.players.get(1);
            Card card1 = player1.getHand().get(0);
            Card card2 = player2.getHand().get(0);

            if (card1.getRank() > card2.getRank()) {
                player1.incrementScore();
                System.out.println("Player 1 wins the round!");
                System.out.println("Player 1: " + player1.getHand());
                System.out.println("Player 2: " + player2.getHand());
                player1.getHand().add(deck.remove(deck.getCards().get(0)));
                player2.getHand().add(deck.remove(deck.getCards().get(0)));
                player2.getHand().remove(card2);
            } else if (card1.getRank() < card2.getRank()) {
                player2.incrementScore();
                System.out.println("Player 2 wins the round!");
                System.out.println("Player 1: " + player1.getHand());
                System.out.println("Player 2: " + player2.getHand());
                player2.getHand().add(deck.remove(deck.getCards().get(0)));
                player1.getHand().add(deck.remove(deck.getCards().get(0)));
                player1.getHand().remove(card1);
            } else if (this.deck.size == 0){
                declareWinner();
                break;
            }
            else {
                System.out.println("WAR!");
                runGame();
            }
        }
    }

    public Card remove(Card card) {
        return this.deck.remove(card);
    }
}
