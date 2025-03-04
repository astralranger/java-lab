// CardGame.java
import java.util.*;

// main class to execute menu-driven program
public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Find all cards of same suit");
            System.out.println("4. Find all cards of same rank");
            System.out.println("5. Find a specific card");
            System.out.println("6. Deal 5 cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter suit: ");
                    String suit = scanner.nextLine();
                    deck.sameCard(suit);
                    break;
                case 4:
                    System.out.print("Enter rank: ");
                    String rank = scanner.nextLine();
                    deck.compareCard(rank);
                    break;
                case 5:
                    System.out.print("Enter rank: ");
                    rank = scanner.nextLine();
                    System.out.print("Enter suit: ");
                    suit = scanner.nextLine();
                    deck.findCard(rank, suit);
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 8);

        scanner.close();
    }
}
