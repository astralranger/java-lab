

## Subdirectory: `Array and ArrayList`

### `ArrayConversion.java`
This class provides methods to convert between arrays and `ArrayList` objects.

- **Class**: `ArrayConversion`
  - **Method**: `arrayToArrayList(Integer[] array)`
    - **Purpose**: Converts an array of `Integer` objects to an `ArrayList<Integer>`.
    - **Parameters**: `Integer[] array` - The input array to convert.
    - **Returns**: `ArrayList<Integer>` - The resulting `ArrayList`.
    - **Implementation**: Uses `Arrays.asList()` and the `ArrayList` constructor to perform the conversion.
  - **Method**: `arrayListToArray(ArrayList<Integer> arrayList)`
    - **Purpose**: Converts an `ArrayList<Integer>` back to an array of `Integer` objects.
    - **Parameters**: `ArrayList<Integer> arrayList` - The input `ArrayList` to convert.
    - **Returns**: `Integer[]` - The resulting array.
    - **Implementation**: Uses `toArray()` method of `ArrayList` to populate a new array.

### `Main.java`
This class serves as the entry point to test the `ArrayConversion` class.

- **Class**: `Main`
  - **Method**: `main(String[] args)`
    - **Purpose**: Demonstrates the functionality of `ArrayConversion` by converting an array to an `ArrayList` and back to an array.
    - **Implementation**: 
      - Creates an instance of `ArrayConversion`.
      - Defines a sample array `{1, 6, 9, 3, 7, 0}`.
      - Converts it to an `ArrayList` and prints the result.
      - Converts the `ArrayList` back to an array and prints it using `Arrays.toString()`.

---

## Subdirectory: `Even and Odd`

### `DisplayArray.java`
This class provides methods to display an array, separate even and odd numbers, and find the smallest consecutive difference.

- **Class**: `DisplayArray`
  - **Method**: `display(ArrayList<Integer> array)`
    - **Purpose**: Prints the contents of an `ArrayList`.
    - **Parameters**: `ArrayList<Integer> array` - The array to display.
    - **Implementation**: Uses `System.out.println()` to output the `ArrayList`.
  - **Method**: `oddEven(ArrayList<Integer> array)`
    - **Purpose**: Separates the numbers in an `ArrayList` into even and odd numbers and prints both lists.
    - **Parameters**: `ArrayList<Integer> array` - The input `ArrayList`.
    - **Implementation**: 
      - Creates two `ArrayList` objects: `even` and `odd`.
      - Iterates through the input array, adding numbers to `even` if divisible by 2, or `odd` otherwise.
      - Prints both lists.
  - **Method**: `smallestConsecutiveDifference(ArrayList<Integer> array)`
    - **Purpose**: Finds the smallest difference between consecutive elements in an `ArrayList`.
    - **Parameters**: `ArrayList<Integer> array` - The input `ArrayList`.
    - **Returns**: `int` - The smallest difference, or `-1` if the array has fewer than 2 elements.
    - **Implementation**: 
      - Checks if the array has at least 2 elements.
      - Initializes the smallest difference with the first pair.
      - Iterates through the array, updating the smallest difference if a smaller one is found.

### `MainProgram.java`
This class serves as the entry point to test the `DisplayArray` and `UserInput` classes.

- **Class**: `MainProgram`
  - **Method**: `main(String[] args)`
    - **Purpose**: Ties together user input and array processing functionality.
    - **Implementation**: 
      - Creates instances of `UserInput` and `DisplayArray`.
      - Gets an `ArrayList` from `UserInput.arrayInput()`.
      - Calls `display()`, `oddEven()`, and `smallestConsecutiveDifference()` on the `DisplayArray` instance.

### `UserInput.java`
This class handles user input to create an `ArrayList`.

- **Class**: `UserInput`
  - **Method**: `arrayInput()`
    - **Purpose**: Prompts the user to enter 5 numbers and stores them in an `ArrayList`.
    - **Returns**: `ArrayList<Integer>` - The list of user-entered numbers.
    - **Implementation**: 
      - Uses a `Scanner` to read input.
      - Loops 5 times to collect integers and adds them to an `ArrayList`.

---

## Subdirectory: `SMallest DIstance`

### `ArrayDistanceFinder.java`
This class finds the index of the pair of numbers with the smallest distance in an array.

- **Class**: `ArrayDistanceFinder`
  - **Method**: `findSmallestDistance(int[] arr)`
    - **Purpose**: Identifies the index of the first number in the pair with the smallest consecutive difference.
    - **Parameters**: `int[] arr` - The input array.
    - **Returns**: `int` - The index of the first number in the pair with the smallest distance, or `-1` if the array has fewer than 2 elements.
    - **Implementation**: 
      - Checks if the array has at least 2 elements.
      - Initializes `minDiff` to `Integer.MAX_VALUE` and `minIndex` to `-1`.
      - Iterates through the array, calculating differences between adjacent elements and updating `minDiff` and `minIndex` when a smaller difference is found.

### `Main.java`
This class serves as the entry point to test the `ArrayDistanceFinder` class.

- **Class**: `Main`
  - **Method**: `main(String[] args)`
    - **Purpose**: Tests the `findSmallestDistance` method with a sample array.
    - **Implementation**: 
      - Creates an instance of `ArrayDistanceFinder`.
      - Defines a sample array `{4, 9, 6, 3, 15, 11, 2}`.
      - Calls `findSmallestDistance()` and prints the resulting index.

---

## Summary
This project demonstrates fundamental Java concepts such as:
- Array and `ArrayList` manipulation (`Array and ArrayList`).
- User input handling and basic array processing (`Even and Odd`).
- Finding minimum differences in arrays (`SMallest DIstance`).

Each subdirectory contains a `Main` class to test the functionality of its respective classes, making the project modular and easy to understand.
