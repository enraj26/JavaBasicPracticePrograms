package com.codewithraju.java.basics.example.operators;


 public class StringConcatenationExamples {
	public static void main(String[] args) {
		// RULE1 : Expressions are evaluated from left to right.
		// Except if there are parenthesis.
		// RULE2 : number + number = number
		// RULE3 : number + String = String
		System.out.println(5 + "Test" + 5); // 5Test5
		System.out.println(5 + 5 + "Test"); // 10Test
		System.out.println("5" + 5 + "Test"); // 55Test
		System.out.println("5" + "5" + "25"); // 5525
		System.out.println(5 + 5 + "25"); // 1025
		System.out.println("" + 5 + 5 + "25"); // 5525
		System.out.println(5 + (5 + "25")); // 5525
	}
}