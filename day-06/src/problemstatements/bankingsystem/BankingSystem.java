package problemstatements.bankingsystem;
import java.util.ArrayList;
import java.util.List;
// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // Creating a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Adding SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA123", "Alice", 5000, 0.04);
        accounts.add(savings);

        // Adding CurrentAccount
        CurrentAccount current = new CurrentAccount("CA456", "Bob", 2000, 1000);
        accounts.add(current);

        // Processing and displaying account details
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println("---------------------------");
        }

        // Demonstrating deposit and withdrawal
        savings.deposit(1000);
        savings.withdraw(2000);
        System.out.println("Updated Balance: " + savings.getBalance());
    }
}
