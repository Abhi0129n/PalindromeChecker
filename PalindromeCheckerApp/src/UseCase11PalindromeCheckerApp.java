
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "civic";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        // Call encapsulated method
        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }
}
