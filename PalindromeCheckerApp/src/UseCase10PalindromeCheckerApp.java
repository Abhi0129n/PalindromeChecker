
public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String original = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = original.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println(original + " is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
