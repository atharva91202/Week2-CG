package problemstatements.bankingsystem;

// Interface Loanable
interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}