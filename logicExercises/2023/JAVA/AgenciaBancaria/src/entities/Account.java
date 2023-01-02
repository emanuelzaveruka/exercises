package entities;

import model.Utils;

public class Account {

    private  static int accountOfCounts = 1;
    private int numberAccount;

    private Client client;

    private Double balance = 0.0;

    public Account(Client client) {
        this.numberAccount = numberAccount;
        this.client = client;
        numberAccount += 1;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "\nNumber Account: " + this.getNumberAccount() +
                "\nName: " + this.client.getNome() +
                "\n:CPF " + this.client.getCpf() +
                "\nEmail: " + this.client.getEmail() +
                "\nBalance: " + Utils.doubleToString(this.getBalance()) +
                "\n";
    }

    public void deposit(Double value){
        if (value > 0){
            setBalance(getBalance() + value);
            System.out.println("Sucess for operation");
        }else{
            System.out.println("Error for operation");
        }
    }

    public void toWithdraw(Double value){
        if (value > 0 && this.getBalance() >= value){
            setBalance(getBalance() - value);
            System.out.println("Sucess for operation");
        }else{
            System.out.println("Error for operation");
        }
    }

    public void transfer(Account accountForDeposit, Double value){
        if (value > 0 && this.getBalance() >= value){
            setBalance(getBalance() - value);

            accountForDeposit.balance = accountForDeposit.getBalance() + value;
            System.out.println("Sucess for operation");
        }else{
            System.out.println("Error for operation");
        }
    }
}
