package beanBasic;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		employee1.setId(123);
		employee1.setSal(20000.00);
		employee1.getPerson().setName("Ak");
		employee1.getPerson().setAge(21);
		
		System.out.println("\nEmployee Details:");
		System.out.println(employee1.getId());
		System.out.println(employee1.getSal());
		System.out.println(employee1.getPerson().getName());
		System.out.println(employee1.getPerson().getAge());
	}
	

}
