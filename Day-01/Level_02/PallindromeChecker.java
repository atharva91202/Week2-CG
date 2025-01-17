import java.util.Scanner;

public class PallindromeChecker {
    String text;

    // Constructor to initialize the text
    public PallindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove special characters and convert to lowercase
        int length = cleanedText.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Taking input from user
        System.out.println("Enter a string to check if it is a palindrome or not");
        String inputText = sc.nextLine();

        //Create an instance of Palindrome Checker
        PallindromeChecker checker = new PallindromeChecker(inputText);

        checker.displayResult();

        sc.close();
    }
}
