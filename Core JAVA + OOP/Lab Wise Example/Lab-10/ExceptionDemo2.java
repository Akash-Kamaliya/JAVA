class InsufficientFundEception extends Exception {
    public InsufficientFundEception(String message){
        super(message);
    }
} 
class Account{
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposite :" + amount + " , current Balance" + balance);
    }
    public void withdraw(double amount) throws InsufficientFundEception{
        if(amount > balance){
            throw new InsufficientFundEception("Withdrawal denied Insufficient Funds :");
        }
        balance -= amount;
        System.out.println("Withdrawal :" + amount + " , Remaining Balance"+ balance);
    }
}
public class ExceptionDemo2 {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        acc.deposit(2000);
        try{
            acc.withdraw(8000);
        }
        catch(InsufficientFundEception e){
            System.out.println(e.getMessage());
        }
    }
}
