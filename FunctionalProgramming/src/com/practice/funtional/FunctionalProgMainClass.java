package com.practice.funtional;

import java.util.Random;

public class FunctionalProgMainClass {
	public static void main(String[] args) {

//		Example ex = new ExampleImpl();
//		ex.print(ex.randomCalculate(10, 20));

		Example exF0= (a,b)->{
			return new Random().nextInt((a+b)/2);
		};
		exF0.print(exF0.randomCalculate(10, 20));
		
		
		Example exF1 = (a, b) -> ExampleImpl.randomCalculateRefer(a, b);
		exF1.print(exF1.randomCalculate(10, 20));
		
		Example exF2= ExampleImpl::randomCalculateRefer;
		exF2.print(exF2.randomCalculate(10, 20));
		
	}

}
