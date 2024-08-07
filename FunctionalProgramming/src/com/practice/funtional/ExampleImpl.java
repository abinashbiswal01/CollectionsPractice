package com.practice.funtional;

import java.util.Random;

public class ExampleImpl {


	public static int randomCalculateRefer(int a, int b) {
		
		int avg=(a+b)/2;
		return new Random().nextInt(avg+100);
	}

	public static void print() {

		System.out.println("Hello World");
	}
}
