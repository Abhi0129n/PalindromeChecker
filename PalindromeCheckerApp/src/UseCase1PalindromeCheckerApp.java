public class UseCase1PalindromeCheckerApp {
    public static void main(String[] args) {
        // UseCase 1: Simple single word palindrome check (case-insensitive)
        String input1 = "racecar";
        System.out.println("Input: " + input1);
        System.out.println("Is palindrome: " + isPalindrome(input1));
        System.out.println();

        String input2 = "hello";
        System.out.println("Input: " + input2);
        System.out.println("Is palindrome: " + isPalindrome(input2));
        System.out.println();

        String input3 = "Level";
        System.out.println("Input: " + input3);
        System.out.println("Is palindrome: " + isPalindrome(input3));
    }

    /**
     * Checks if a string is a palindrome (ignoring case)
     * Only works with alphanumeric characters
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}