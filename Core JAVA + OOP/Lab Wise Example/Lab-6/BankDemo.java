import java.util.Scanner;

class Bank_Account {
    private int accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    public void getAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter User Name: ");
        userName = scanner.nextLine();
        
        System.out.print("Enter Email: ");
        email = scanner.nextLine();
        
        System.out.print("Enter Account Type: ");
        accountType = scanner.nextLine();
        
        System.out.print("Enter Account Balance: ");
        accountBalance = scanner.nextDouble();
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account();
        account.getAccountDetails();
        account.displayAccountDetails();
    }
}
