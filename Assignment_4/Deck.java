// Deck.java
import java.util.*;

// class representing a deck of cards
class Deck {
    private ArrayList<Card> cards; // arraylist to store deck of cards
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // constructor to create a new deck
    public Deck() {
        createDeck();
    }

    // method to create a deck of 52 cards
    public void createDeck() {
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // method to print all cards in the deck
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    // method to print a specific card from deck
    public void printCard(int index) {
        if (index >= 0 && index < cards.size()) {
            System.out.println(cards.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

    // method to find all cards of the same suit as the given card
    public void sameCard(String suit) {
        for (Card card : cards) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // method to compare cards with the same rank
    public void compareCard(String rank) {
        for (Card card : cards) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // method to search for a particular card
    public void findCard(String rank, String suit) {
        for (Card card : cards) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

    // method to deal 5 random cards
    public void dealCard() {
        Collections.shuffle(cards);
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
    }

    // method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled.");
    }
}