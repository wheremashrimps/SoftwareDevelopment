import javax.swing.DefaultBoundedRangeModel;

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves
 * as a modifier.
 *
 * @author dancye
 * @modified by Team Shrimps
 */
public class Card {
    // default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular
     *         playing card etc.
     */

    public enum Suit {
        HEARTS,
        SPADES,
        DIAMONDS,
        CLUBS;

        public Suit getSuit() {
            return this;
        }
    }

    public enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;

        public int getRank() {
            switch (this) {
                case ACE:
                    return 1;
                case TWO:
                    return 2;
                case THREE:
                    return 3;
                case FOUR:
                    return 4;
                case FIVE:
                    return 5;
                case SIX:
                    return 6;
                case SEVEN:
                    return 7;
                case EIGHT:
                    return 8;
                case NINE:
                    return 9;
                case TEN:
                    return 10;
                case JACK:
                    return 11;
                case QUEEN:
                    return 12;
                case KING:
                    return 13;
                default:
                    return 0;
            }
        }
    }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        switch (this.rank) {
            case ACE:
                return 1;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case JACK:
                return 11;
            case QUEEN:
                return 12;
            case KING:
                return 13;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
