package p05_exceptions.domain;

import p05_exceptions.domain.exceptions.InsufficientBalanceException;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
    }

    public void withdraw(double withdrawAmount) throws InsufficientBalanceException {
        if (withdrawAmount <= 0){
            throw new IllegalArgumentException("Unavailable amount");
        }else if(withdrawAmount > balance){
            throw new InsufficientBalanceException(balance, withdrawAmount);
        }else{
            this.balance -= withdrawAmount;
            System.out.printf("Withdraw Successful: %.2f\nNew balance: %.2f\n\n", withdrawAmount, this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
