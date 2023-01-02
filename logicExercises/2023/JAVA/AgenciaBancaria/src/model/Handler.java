package model;

import entities.Account;
import entities.Client;

import java.util.Scanner;

import static controller.Operations.operations;
import static view.BankAgency.accountBanks;

public class Handler {

    static Scanner scanner = new Scanner(System.in);
    public static void createAccount(){
        System.out.println("\nName: ");
        clearBuffer(scanner);

        String name = scanner.nextLine();

        System.out.println("\nCPF: ");
        String cpf = scanner.nextLine();

        System.out.println("\nemail: ");
        String email = scanner.nextLine();

        Client client = new Client(name, cpf, email);

        Account account = new Account(client);

        accountBanks.add(account);
        System.out.println("Sucessfully created account");

        operations();
    }

    public static Account findAccount(int numberAccount){
        Account account = null;

        if (accountBanks.size() > 0 ){
            for (Account accountBank : accountBanks) {
                if(accountBank.getNumberAccount() == numberAccount) {
                    account = accountBank;
                }
            }
        }
        return account;
    }

    public static void deposit(){
        System.out.println("Number of account");
        int numberAccount = scanner.nextInt();

        Account account = findAccount(numberAccount);

        if (account != null){
            System.out.println("What value do you want deposit? ");
            Double valueDeposit = scanner.nextDouble();
            account.deposit(valueDeposit);
            System.out.println("Sucessfully deposited");
        }else{
            System.out.println("Doesn't exist account !!! ");
        }
        operations();
    }

    public static void toWithdraw(){
        System.out.println("Number of account");
        int numberAccount = scanner.nextInt();

        Account account = findAccount(numberAccount);

        if (account != null){
            System.out.println("What value do you want to Withdraw? ");
            Double valueToWithdraw = scanner.nextDouble();
            account.toWithdraw(valueToWithdraw);
        }else{
            System.out.println("Doesn't exist account !!! ");
        }
        operations();
    }

    public static void transfer(){
        System.out.println("Number of sender account: ");
        int numberSenderAccount = scanner.nextInt();

        Account senderAccount = findAccount(numberSenderAccount);

        if(senderAccount != null){
            System.out.println("Number of destiny account");
            int destinyNumberAccount = scanner.nextInt();

            Account destinyAccount = findAccount(destinyNumberAccount);

            if (destinyAccount != null){
                System.out.println("What value do you want to transfer? ");
                Double valueTranfer = scanner.nextDouble();

                senderAccount.transfer(destinyAccount, valueTranfer);
            }
        }else {
            System.out.println("Account for transfer not found");
        }
        operations();
    }

    public static void listAccounts(){
        if(accountBanks.size() > 0){
            for(Account account: accountBanks){
                System.out.println(account);
            }
        }else {
            System.out.println("Doesn't exist registered accounts");
        }
        operations();
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
