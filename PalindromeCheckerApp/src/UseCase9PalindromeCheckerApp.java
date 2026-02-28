
public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "noon";

        // Check palindrome using recursion
        if (isPalindrome(original, 0, original.length() - 1)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}
