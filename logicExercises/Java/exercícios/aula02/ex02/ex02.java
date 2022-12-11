import java.util.Scanner;

public class ex02{
   
   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
    int mediaUm = (8 + 9 + 7)/3;
    int mediaDois = (4 + 5 + 6)/3;
    
    int totalMedias = mediaUm + mediaDois;
    System.out.println("O total da media aritmética entre os números é: " + totalMedias);

   }
}