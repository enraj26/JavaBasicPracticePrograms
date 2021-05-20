package com.codewithraju.java.basics.example.operators;


 public class LogicalOperators {
	public static void main(String[] args) {
		// Short Circuit And Operator - &&
		// True when both operands are true
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		// Short Circuit Or Operator - ||
		// True when atleast one of operands are true
		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		// Logical Operators work only with boolean's not number's
		// System.out.println(5 || 6);//COMPILER ERROR

		// Short circuit operators are Lazy.
		// They stop execution the moment result is clear.
		// For &&, if first expression is false,result is false.
		// For ||, if first expression is true, the result is true.
		// In above 2 situations, second expressions are not executed.
		int i = 10;
		System.out.println(true || ++i == 11);// true
		System.out.println(false && ++i == 11);// false

		// i remains 10, as ++i expressions are not executed
		System.out.println(i);// 10

		// Logical Operators &, | are similar to &&, || except
		// that they don't short ciruit. They execute the second
		// expression even if the result is clear.

		int j = 10;
		System.out.println(true | ++j == 11);// true
		System.out.println(false & ++j == 12);// false

		// j becomes 12, as both ++j expressions are executed
		System.out.println(j);// 12

		// Operator exclusive-OR
		// Result is true only if one of the operands is true
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(true ^ true);// false
		System.out.println(false ^ false);// false

		// Not Operator (!)
		// Result is the negation of the expression
		System.out.println(!false);// true
		System.out.println(!true);// false

	}
}