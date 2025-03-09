


## File: `Card.java`

### `Card.java`
This class represents a single playing card with a suit and rank.

- **Class**: `Card`
  - **Fields**:
    - `String suit`: The suit of the card (e.g., "Hearts", "Diamonds").
    - `String rank`: The rank of the card (e.g., "Ace", "King", "2").
  - **Constructor**: `Card(String suit, String rank)`
    - **Purpose**: Initializes a card with the given suit and rank.
    - **Parameters**: 
      - `suit`: The suit of the card.
      - `rank`: The rank of the card.
    - **Implementation**: Assigns the parameters to the class fields using `this`.
  - **Method**: `toString()`
    - **Purpose**: Returns a string representation of the card (e.g., "Ace of Spades").
    - **Returns**: `String` - The rank followed by " of " and the suit.
    - **Implementation**: Concatenates `rank` and `suit` with a descriptive format.

---

## File: `CardGame.java`

### `CardGame.java`
This class serves as the main entry point for the program, providing a menu-driven interface to interact with the `Deck` class.

- **Class**: `CardGame`
  - **Method**: `main(String[] args)`
    - **Purpose**: Executes a loop displaying a menu and processing user input to perform operations on a `Deck` object.
    - **Implementation**: 
      - Creates a `Scanner` for user input and a `Deck` instance.
      - Displays a menu with 8 options:
        1. Print Deck
        2. Print a Card
        3. Find all cards of the same suit
        4. Find all cards of the same rank
        5. Find a specific card
        6. Deal 5 cards
        7. Shuffle Deck
        8. Exit
      - Uses a `switch` statement to call corresponding `Deck` methods based on the user's choice.
      - Loops until the user selects option 8 (Exit).
    - **Additional Notes**: Includes student information (name, ID, batch) as comments.

---

## File: `Deck.java`

### `Deck.java`
This class represents a deck of 52 playing cards and provides methods to manipulate and query the deck.

- **Class**: `Deck`
  - **Fields**:
    - `private ArrayList<Card> cards`: Stores the deck as an `ArrayList` of `Card` objects.
    - `private static final String[] suits`: Array of suits {"Hearts", "Diamonds", "Clubs", "Spades"}.
    - `private static final String[] ranks`: Array of ranks {"2", "3", ..., "10", "Jack", "Queen", "King", "Ace"}.
  - **Constructor**: `Deck()`
    - **Purpose**: Initializes a new deck by calling `createDeck()`.
  - **Method**: `createDeck()`
    - **Purpose**: Populates the `cards` ArrayList with 52 unique `Card` objects.
    - **Implementation**: Nested loops iterate over `suits` and `ranks`, creating a `Card` for each combination.
  - **Method**: `printDeck()`
    - **Purpose**: Prints all cards in the deck.
    - **Implementation**: Iterates over `cards` and prints each card using its `toString()` method.
  - **Method**: `printCard(int index)`
    - **Purpose**: Prints a specific card at the given index.
    - **Parameters**: `int index` - The index of the card (0-51).
    - **Implementation**: Checks if the index is valid, then prints the card at that index or an error message.
  - **Method**: `sameCard(String suit)`
    - **Purpose**: Prints all cards with the specified suit.
    - **Parameters**: `String suit` - The suit to match.
    - **Implementation**: Iterates over `cards`, printing each card whose `suit` matches (case-insensitive).
  - **Method**: `compareCard(String rank)`
    - **Purpose**: Prints all cards with the specified rank.
    - **Parameters**: `String rank` - The rank to match.
    - **Implementation**: Iterates over `cards`, printing each card whose `rank` matches (case-insensitive).
  - **Method**: `findCard(String rank, String suit)`
    - **Purpose**: Searches for and prints a specific card with the given rank and suit.
    - **Parameters**: 
      - `String rank` - The rank to match.
      - `String suit` - The suit to match.
    - **Implementation**: Iterates over `cards`, printing the card if both `rank` and `suit` match (case-insensitive), or "Card not found" if no match is found.
  - **Method**: `dealCard()`
    - **Purpose**: Deals and prints 5 random cards from the deck.
    - **Implementation**: Shuffles the deck using `Collections.shuffle()` and prints the first 5 cards.
  - **Method**: `shuffleDeck()`
    - **Purpose**: Shuffles the deck and notifies the user.
    - **Implementation**: Uses `Collections.shuffle()` to randomize the `cards` ArrayList and prints a confirmation message.

---
