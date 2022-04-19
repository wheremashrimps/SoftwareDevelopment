import java.util.ArrayList;

public class War extends Game {

    private DeckOfCards deck;
    private ArrayList<Player> players;

    public War(String name) {
        super(name);
        this.deck = new DeckOfCards(52);
        this.players = new ArrayList<Player>();
        this.deck.generateDeck();
        this.deck.shuffle();
    }

    @Override
    public void play() {
        for (int i = 0; i < 2; i++) {
            this.players.add(new Player("Player " + (i + 1)));
        }
        runGame();

    }

    @Override
    public void declareWinner() {
        Player player1 = this.players.get(0);
        Player player2 = this.players.get(1);
        if (player1.getScore() > player2.getScore() && this.deck.getSize() == 0) {
            System.out.println(player1.getName() + " wins with a score of " + player1.getScore());
        } else if (player1.getScore() < player2.getScore() && this.deck.getSize() == 0) {
            System.out.println(player2.getName() + " wins with a score of " + player2.getScore());
        } 
    }

    public void runGame() {
        while (this.deck.getSize() > 0) {
            declareWinner();
            for (Player player : this.players) {
                player.setHand(this.deck.remove());
            }
            if (players.get(0).getHand().getRank() > players.get(1).getHand().getRank()) {
                players.get(0).incrementScore();
            } else if (players.get(0).getHand().getRank() < players.get(1).getHand().getRank()) {
                players.get(1).incrementScore();
            }
        }
    }

    public Card remove(Card card) {
        return this.deck.remove(card);
    }
}
