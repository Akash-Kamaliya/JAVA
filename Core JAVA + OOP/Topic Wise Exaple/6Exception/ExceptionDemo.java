class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) { super(msg); }
}

class BankAccount {
    private double balance;
    public BankAccount(double b) { balance = b; }

    public void withdraw(double amt) throws InsufficientBalanceException {
        if (amt > balance) {
            throw new InsufficientBalanceException("Not enough balance: requested " + amt);
        }
        balance -= amt;
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(1000);
        try {
            a.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}
