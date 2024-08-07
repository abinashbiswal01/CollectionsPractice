package com.practice.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee(10,"Rohit",new Date(),"batsman");
		Employee e2=new Employee(11,"Virat",new Date(),"batsman");
		Employee e3=new Employee(12,"Sky",new Date(),"batsman");
		Employee e4=new Employee(13,"KL",new Date(),"batsman/wicketkeeper");
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
		
		List<Integer> ids=new ArrayList<>();
		for(Employee e:employees) {
			ids.add(e.getId());
		}
		System.out.println(ids);
		
		//using Stream
		List<Integer> employeeIds=employees.stream()
				.map(e->e.getId())
				.collect(Collectors.toList());
		System.out.println(employeeIds);
		System.out.println("______________________________________");
		//without limits
		List<Integer> employeeIdsNoLimits=employees.stream()
				.filter(e->{
					System.out.println("filtering.."+e.getId());
					return e.getId()%2==0;
				})
				.map(e->{
					System.out.println("Mapping.."+e.getId());
					return e.getId();
				})
				.collect(Collectors.toList());
		System.out.println(employeeIdsNoLimits);
		
		System.out.println("______________________________________");
		//using limits
		List<Integer> employeeIdsLimits=employees.stream()
				.filter(e->{
					System.out.println("filtering.."+e.getId());
					return e.getId()%2==0;
				})
				.map(Employee::getId)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(employeeIdsLimits);
		
		System.out.println("______________________________________");
		//map employee ids to cricketer objects
		
		List<Cricketers> crics=employees.stream()
				.map(Employee::getId)
				.map(Cricketers::new)
				.collect(Collectors.toList());
		System.out.println(crics.size());
		
		System.out.println("______________________________________");
		//add 100 to each id
		List<Integer> employeeIdsAdd100=employees.stream()
				.filter(e->{
					System.out.println("filtering.."+e.getId());
					return e.getId()%2==0;
				})
				.map(e->{
					System.out.println("Mapping.."+e.getId());
					return e.getId()+100;
				})
				.collect(Collectors.toList());
		System.out.println(employeeIdsAdd100);
		System.out.println("______________________________________");
		
		//matching
	}
}
