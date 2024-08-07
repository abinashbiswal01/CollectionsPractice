package com.practice.funtional;

@FunctionalInterface
public interface Example {

	abstract int randomCalculate(int a ,int b);
	
	default void print(int result) {
		System.out.println("random result: "+result);
	}
	default void printString(String result) {
		System.out.println(result);
	}
	
	default String helloWorld() {
		return "Hello World!!";
	}
}
