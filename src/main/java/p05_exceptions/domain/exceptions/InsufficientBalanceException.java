package p05_exceptions.domain.exceptions;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(double currentBalance, double withdrawAmount) {
        super("Insufficient Balance. Available: "+currentBalance+"\nWithdraw solicitation: "+withdrawAmount);
    }
}
