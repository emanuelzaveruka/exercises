package view;

import entities.Account;
import entities.Client;

import java.util.ArrayList;
import java.util.Scanner;

import static controller.Operations.operations;

public class BankAgency {



    public static ArrayList<Account> accountBanks;

    public static void main(String[]args){
        accountBanks = new ArrayList<Account>();

        operations();
    }




}
