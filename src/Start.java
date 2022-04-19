public class Start {
    
    public static void main(String[] args) {
        
        // Create a new deck of cards
        DeckOfCards deck = new DeckOfCards(52);
        War war = new War("War");
        
        // Shuffle the deck
        deck.shuffle();
        
        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        
        // Print the players' hands
        System.out.println(player1.getName() + ": " + player1.getHand());
        System.out.println(player2.getName() + ": " + player2.getHand());
        
        // Run the game
        war.play();
    }
    
}
