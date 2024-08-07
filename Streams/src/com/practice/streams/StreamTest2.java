package com.practice.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {

	public static void main(String[] args) {
		
		Employee e1=new Employee(10,"Rohit",new Date(),"batsman");
		Employee e2=new Employee(11,"Virat",new Date(),"batsman");
		Employee e3=new Employee(12,"Sky",new Date(),"batsman");
		Employee e4=new Employee(23,"KL",new Date(),"batsman/wicketkeeper");
		Employee e5=new Employee(14,"Pant",new Date(),"wicketkeeper/batsman");
		Employee e6=new Employee(15,"Bumrah",new Date(),"bowler");
		Employee e7=new Employee(16,"Axar",new Date(),"allrounder");
		
		List<Employee> employees= new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		
		employees.stream()
		.filter(e-> e.getCategory().contains("wicketkeeper"))
		.map(Employee::getName)
		.forEach(System.out::println);
		System.out.println("______________________________________");
		
		//printing length of each element
		employees.stream()
		.filter(e-> e.getCategory().contains("wicketkeeper"))
		.map(Employee::getName)
		.map(String::length)
		.forEach(System.out::println);
		System.out.println("______________________________________");
		
		//checking batsman name with t
		boolean result=employees.stream()
		.filter(e-> e.getCategory().contains("batsman"))
		.map(Employee::getName)
		.anyMatch(s-> s.contains("t")); //virat and rohit
		
		System.out.println(result);
		
		System.out.println("______________________________________");
		
		//highest id
		employees.stream()
		.map(Employee::getId)
		.reduce(0, (a,b)-> Integer.max(a, b));
		
		
		System.out.println(employees.stream()
				.map(Employee::getId)
				.reduce(0, (a,b)-> Integer.max(a, b)));
		
		//sum of all ids
		System.out.println(employees.stream()
		.map(Employee::getId)
		.reduce(0 ,(a,b)->a+b));
	}
}
