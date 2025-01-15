// UserInput.java
import java.util.*;

class UserInput{

  int[] userInput(){

    int[] numbers = new int[2];
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 1st number: ");
    numbers[0] = scan.nextInt();

    System.out.println("Enter 2st number: ");
    numbers[1] = scan.nextInt();

    scan.close(); 
    return numbers;

  }
}
