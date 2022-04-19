import java.util.ArrayList;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

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

        for (int i = 0; i < 2; i++) {
            this.players.add(new Player("Player " + (i + 1)));
        }
        this.deck.generateDeck();
        this.deck.shuffle();

    }

    @Override
    public void declareWinner() {

        if (players.get(0).getScore() > players.get(1).getScore()) {
            System.out.println(players.get(0).getName() + " wins with a score of " + players.get(0).getScore());
        } else if (players.get(1).getScore() > players.get(0).getScore()) {
            System.out.println(players.get(1).getName() + " wins with a score of " + players.get(1).getScore());
        }
    }

    public void runGame() {

        while (this.deck.getSize() > 0) {

            players.get(0).setHand(deck.remove());
            players.get(1).setHand(deck.remove());
            System.out.println(players.get(0).getHand());
            System.out.println(players.get(1).getHand());

            if (players.get(0).getHand() != null && players.get(1).getHand() != null) {
                if (players.get(0).getHand().getRank() > players.get(1).getHand().getRank()) {
                    players.get(0).incrementScore();
                    System.out.println(players.get(0).getScore());
                    System.out.println(players.get(1).getScore());

                } else if (players.get(0).getHand().getRank() < players.get(1).getHand().getRank()) {
                    players.get(1).incrementScore();
                    System.out.println(players.get(0).getScore());
                    System.out.println(players.get(1).getScore());

                }

            }

        }

    }

    public Card remove(Card card) {
        return this.deck.remove(card);
    }
}
