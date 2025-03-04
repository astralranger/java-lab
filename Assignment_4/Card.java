// Card.java
import java.util.*;

// class representing a single card with suit and rank
class Card {
    String suit;
    String rank;

    // constructor to initialize a card with given suit and rank
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // method to return card details as a string
    public String toString() {
        return rank + " of " + suit;
    }
}
