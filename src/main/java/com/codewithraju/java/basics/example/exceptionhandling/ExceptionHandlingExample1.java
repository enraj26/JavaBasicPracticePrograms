package com.codewithraju.java.basics.example.exceptionhandling;


//Exception Handling - Best Practices

//Runtime Exceptions => Unchecked exceptions
//Checked Exceptions

class CheckedException extends Exception {

}

class RuntimeExceptionExample extends RuntimeException {

}

class Test {
	void readAFileAndParse() throws RuntimeExceptionExample {
		// Reading a file => FileNotFound
		// Parses the file => FileIsNotInCorrectFormat
	}
}

class Reuse {
	void doSomething() {
		Test test = new Test();
		test.readAFileAndParse();
	}

	public void firstMethod() throws RuntimeException {

	}

	public void secondMethod() {
		firstMethod();
	}
}

// Below class definitions show creation of a programmer defined exception in
// Java.
// Programmer defined classes
class CheckedException1 extends Exception {
}

class CheckedException2 extends CheckedException1 {
}

class UnCheckedException extends RuntimeException {
}

class UnCheckedException2 extends UnCheckedException {
}

class Connection {
	void open() {
		System.out.println("Connection Opened");
	}

	void close() {
		System.out.println("Connection Closed");
	}
}

public class ExceptionHandlingExample1 {

	public static void methodThrowCheckedException() throws RuntimeException {
		throw new RuntimeException();
	}

	public static void methodSomething() {
		ExceptionHandlingExample1.methodThrowCheckedException();
	}

	// Exception Handling Example 1
	// Let's add a try catch block in method2
	public static void main(String[] args) {
		method1();
		System.out.println("Line after Exception - Main");
	}

	private static void method1() {
		method2();
		System.out.println("Line after Exception - Method 1");
	}

	private static void method2() {
		Connection connection = new Connection();
		connection.open();
		try {
			return;
		} catch (Exception e) {

		} finally {
			// 1
			// 2
			// 3
		}
	}
}
