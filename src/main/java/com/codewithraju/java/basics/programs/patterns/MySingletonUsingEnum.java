package com.codewithraju.java.basics.programs.patterns;

public enum MySingletonUsingEnum {
	INSTANCE;
	private MySingletonUsingEnum() {
		System.out.println("Here");
	}

	public String retrieveSomething() {
		return "DUMMY";
	}

}