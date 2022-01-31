package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employes will be registered?");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println("Employee # " + (i + 1) + " :");
			//id
			System.out.print("id: ");
			Integer id =  sc.nextInt();
			//name
			System.out.print("name: ");
			sc.nextLine(); //clean buffer
			String name =  sc.nextLine();
			//Salary
			System.out.print("Salary: ");
			Double salary =  sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
			
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List out employes");
		
		for (Employee e : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
}
