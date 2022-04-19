/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */


import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for
 * reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 *         //@modified by Team Shrimps
 */
public abstract class GroupOfCards {

    // The group of cards, stored in an ArrayList
    protected ArrayList<Card> cards;
    protected int size;// the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<Card>(52);
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return this.size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

    public Card remove(Card card) {
        this.cards.remove(card);
        return card;
    }

}// end class
