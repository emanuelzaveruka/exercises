import java.util.Scanner;

public class ex03{
	
	public static void main(String[] args){
  	
  	Scanner scanner = new Scanner(System.in);
  	
  	System.out.println("informe seu salário");
  	double salario = scanner.nextDouble();
	
	  System.out.println("seu salário com o reajuste de 1% é: " + ((salario*0.10)+salario) );
	}
}
