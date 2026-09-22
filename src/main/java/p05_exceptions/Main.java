// 08-29-2026
// first tests with exceptions

package p05_exceptions;

import p05_exceptions.domain.BankAccount;
import p05_exceptions.domain.exceptions.InsufficientBalanceException;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Garcia");
        bankAccount1.setBalance(500);

        BankAccount bankAccount2 = new BankAccount("Reyna");
        bankAccount2.setBalance(300);

        BankAccount bankAccount3 = new BankAccount("Clove");
        bankAccount3.setBalance(200);

        //ok withdraw test
        try {
            bankAccount1.withdraw(300);
        } catch (InsufficientBalanceException | IllegalArgumentException e){
            e.printStackTrace();
        } finally {
            System.out.println("First withdraw operation completed");
        }


        //Unavailable amount withdraw test
        try {
            bankAccount2.withdraw(0);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Second withdraw operation completed");
        }


        //InsufficientBalanceException custom exception withdraw test
        try {
            bankAccount3.withdraw(500);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Third withdraw operation completed");
        }
    }
}
