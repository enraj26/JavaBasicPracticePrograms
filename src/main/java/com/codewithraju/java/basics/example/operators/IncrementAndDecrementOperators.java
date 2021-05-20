package com.codewithraju.java.basics.example.operators;


 public class IncrementAndDecrementOperators {
	public static void main(String[] args) {
		// Except for a minor difference
		// ++i,i++ is similar to i = i+1
		// --i,i-- is similar to i = i-1
		// ++i is called pre-increment,i++ post increment
		// pre-increment statement returns value after increment
		// post-increment statement returns value before increment
		int i = 25;
		int j = ++i;// i is incremented to 26, assigned to j
		System.out.println(i + " " + j);// 26 26

		i = 25;
		j = i++;// i value(25) is assigned to j, then incremented to 26
		System.out.println(i + " " + j);// 26 25

		i = 25;
		j = --i;// i is decremented to 24, assigned to j
		System.out.println(i + " " + j);// 24 24

		i = 25;
		j = i--;// i value(25) is assigned to j, then decremented to 24
		System.out.println(i + " " + j);// 24 25

		final int k = 100;
		// j=k++;//COMPILER ERROR! Final value cannot be modified

	}
}