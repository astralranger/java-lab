// Calculator.java
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Calculator {

  // method for addition of two numbers
    public double add(double a, double b) {
        return a + b;
    }
  
  // method for subtract of two numbers
    public double subtract(double a, double b) {
        return a - b;
    }

  // Method for multiply of two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

  // Method for divide of two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

  // Method to generate Fibonacci sequence up to the specified number of terms
    public List<Integer> fibonacci(int terms) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < terms; i++) {
            sequence.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return sequence;
    }

  // Method to calculate the mean of an array
    public double mean(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

   // Method to calculate the variance of an array
    public double variance(double[] array) {
        double mean = mean(array);
        double sumSquaredDiffs = 0;
        for (double num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return sumSquaredDiffs / array.length;
    }
}
