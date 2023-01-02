package controller;

import java.util.Scanner;

import static model.Handler.*;

public class Operations {
    static Scanner scanner = new Scanner(System.in);
    public static void operations(){
        System.out.println("------------------------------------------------------");
        System.out.println("-------------Welcome a our agency---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Select the operation *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Crate account   |");
        System.out.println("|   Opção 2 - Deposit         |");
        System.out.println("|   Opção 3 - To WithDraw     |");
        System.out.println("|   Opção 4 - Transfer        |");
        System.out.println("|   Opção 5 - List            |");
        System.out.println("|   Opção 6 - Exit            |");

        int operation = scanner.nextInt();

        switch (operation){
            case 1:
                createAccount();
                break;
            case 2:
                deposit();
                break;
            case 3:
                toWithdraw();
                break;
            case 4:
                transfer();
                break;
            case 5:
                listAccounts();
                break;
            case 6:
                System.out.println("thanks for use our system");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                operations();
                break;
        }

    }
}
