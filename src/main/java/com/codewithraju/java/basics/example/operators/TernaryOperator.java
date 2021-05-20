package com.codewithraju.java.basics.example.operators;


 public class TernaryOperator {
	public static void main(String[] args) {
		int age = 18;
		// syntax - booleanCondition?ResultIfTrue:ResultIfFalse;
		System.out.println(age >= 18 ? "Can Vote" : "Cannot Vote");// Can Vote

		age = 15;
		System.out.println(age >= 18 ? "Can Vote" : "Cannot Vote");// Cannot
																	// Vote
	}
}