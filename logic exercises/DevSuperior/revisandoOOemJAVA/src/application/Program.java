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
		
		Integer pos = position(list, idsalary);
		
		if (pos == -1) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List out employes");
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static int position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++){
			 if (list.get(i).getId() == id) {
				 return i;
			 }
		 }
		return -1;
	}
	
	
	
	//
	//Uma outra forma de retornar os valores em nossa função
	//É usando o tipo primitivo int
	//
	/*	
	public int hasId(List<Employee> list, int id) {
		 (int i = 0; i < list.size(); i++){
			 if (list.get(i).getId() == id) {
				 return i;
			 }
			return -1;
		 }
	}
	*/
	
}
