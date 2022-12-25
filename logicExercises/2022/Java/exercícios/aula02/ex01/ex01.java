import java.util.Scanner;

public class ex01{
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("informe sua idade em anos");
    int idade = scanner.nextInt();
    
    System.out.println("informe os meses");
    int meses = scanner.nextInt();
    
    System.out.println("Informe os dias");
    int dias = scanner.nextInt();
    
    int totalDias = (meses * 30) + (idade * 365) + dias;
    
    System.out.println("sua idade espressa em dias é: " + totalDias);
    
    
  }
}