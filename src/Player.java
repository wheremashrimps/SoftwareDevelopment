/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * //@modified by Team Shrimps
 */
public class Player {

    private String name; //the unique name for this player
    private Card hand; //the cards held by this player
    private int score; //the player's score

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Card(null, null);
        this.score = 0;
    }


    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the player's hand
     */
    public Card getHand() {
        if (this.hand == null) {
            this.hand = new Card(null, null);
        }
        return hand;
    }

    /**
     * @param hand the player's hand to set
     */
    public void setHand(Card hand) {
        this.hand = hand;
    }

    /**
     * @return the player's score
     */

    public int getScore() {
        return score;   
    }

    /**
     * @param score the player's score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Increment the players score
     */
    public void incrementScore() {
        this.score++;
    }

    public String printHand() {
        String hand = this.hand.getRank() + " of " + this.hand.getSuit();
        return hand;
    }

    


}
