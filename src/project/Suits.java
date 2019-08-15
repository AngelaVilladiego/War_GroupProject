/*
 * An enum class to define the suits of a card
 */
package project;

/**
 *
 * @author Angela
 */
public enum Suits {
    DIAMONDS {
        @Override
        public String toString() {
            return "Diamonds";
        }
    }, 
    CLUBS {
        @Override
        public String toString() {
            return "Clubs";
        }
    }, 
    HEARTS {
        @Override
        public String toString() {
            return "Hearts";
        }
    }, 
    SPADES {
        @Override
        public String toString() {
            return "Spades";
        }
    };
}
