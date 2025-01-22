# Project Description

This project is a simple calculator program written in Java. It is divided into three files:

Main.java: The main driver file that coordinates inputs and operations.

UserInput.java: Handles user input for numbers, arrays, and operation selection.

Calculator.java: Contains all mathematical operations and utility functions.

File Descriptions

Main.java

This file contains the entry point for the program. It:

Displays a menu of available operations.

Uses the UserInput class to get user input.

Calls the corresponding methods from the Calculator class based on the user's choice.

UserInput.java

This file is responsible for handling all user inputs. It contains the following methods:

getChoice(): Prompts the user to select an operation from the menu and returns the choice as an integer.

getNumber(): Prompts the user to enter a single number and returns it as a double.

getInt(): Prompts the user to enter an integer and returns it.

getArray(int size): Prompts the user to input an array of numbers. The size of the array is specified by the size parameter. Returns the array as a double array.

Calculator.java

This file contains the core functionality of the program. It includes the following methods:

add(double a, double b): Returns the sum of two numbers.

subtract(double a, double b): Returns the difference between two numbers.

multiply(double a, double b): Returns the product of two numbers.

divide(double a, double b): Returns the result of dividing the first number by the second. Throws an exception if the second number is zero.

fibonacci(int terms): Returns a list of Fibonacci numbers up to the specified number of terms.

mean(double[] array): Returns the mean (average) of the numbers in the array.

variance(double[] array): Returns the variance of the numbers in the array.

How to Run the Program

Compile all three .java files using a Java compiler.

Run the Main class to start the program.

Follow the prompts to select an operation and provide input as required.
