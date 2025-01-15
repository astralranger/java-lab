// Main.java
import java.util.*;
class Main{
  public static void main(String[] args){
    UserInput in = new UserInput();
    Calculator cal = new Calculator();
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose operation:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.print("Enter choice(1/2/3/4): ");
    int choice = scan.nextInt();
    int[] numbers = in.userInput();
    int result = 0;
    switch(choice){
      case 1:
        result = cal.addition(numbers);
        System.out.println("Addition: " + result);
        break;
      case 2:
        result = cal.subtraction(numbers);
        System.out.println("Subtraction: " + result);
        break;
      case 3:
        result = cal.multiplication(numbers);
        System.out.println("Multiplication: " + result);
        break;
      case 4:
        result = cal.division(numbers);
        System.out.println("Division: " + result);
        break;
      default:
        System.out.println("Invalid input");
    }
    scan.close();
  }
}
