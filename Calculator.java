package com.elevate.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// Creating scanner calss instance which reads the input h
		Scanner s = new Scanner(System.in);
		boolean nextOperation = true;
		while (nextOperation) {
			System.out.print("Entet a nember 1: ");
			try {
				double number1 = s.nextDouble();
				System.out.print("Enter an operator (+, -, *, /):  ");
				char operator = s.next().charAt(0);
				System.out.print("Enter a number 2: ");
				double number2 = s.nextDouble();
				double result;
				// Using switch case to perform operations
				switch (operator) {
				case '+':
					result = number1 + number2;
					System.out.println(result);
					break;
				case '-':
					result = number1 - number2;
					System.out.println(result);
					break;
				case '*':
					result = number1 * number2;
					System.out.println(result);
					break;
				case '/':
					result = number1 / number2;
					System.out.println(result);
					break;
				default:
					System.out.println("Invalit Operator:");
				}
				System.out.print("Want to perform another operation(yes/no): ");
				String response = s.next();
				if (response.equalsIgnoreCase("YES"))
					nextOperation = true;
				else
					nextOperation = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter valid numbers");
				s.next();
			}
		}
		// closing scanner object
		s.close();
	}
}
