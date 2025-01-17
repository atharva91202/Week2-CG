import java.util.Scanner;
public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    //Creating Constructor to initialise Bankaccount object
    public BankAccount(String accountHolder,int accountNumber , double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Method to deposit money
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Successfully deposited Rs. " + amount );
        }else{
            System.out.println("Please Deposit more than 0");
        }
    }
    //Method to withdraw money
    public void withdraw(double amount){
        if(amount>0){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Successfully withdrew : " + amount);
            }else {
                System.out.println("Withdraw amount exceed balance");
            }
        }else {
            System.out.println("Withdraw greater than 0");
        }
    }
    //Method to display details of account
    public void display(){
        System.out.println("Account Holder " + accountHolder );
        System.out.println("Account Number : "  + accountNumber);
        System.out.println("Current balance : " + balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Atharva",1002463,37778.96);
        account1.display();

        // Simulate ATM operations
        System.out.println("\n--- Simulating Transactions ---");
        account1.deposit(1000.00);  // Deposit money
        account1.display();

        account1.withdraw(2000.00); // Withdraw money
        account1.display();

        account1.withdraw(40000.00); // Attempt to withdraw more than the balance
        account1.display();

    }
}
