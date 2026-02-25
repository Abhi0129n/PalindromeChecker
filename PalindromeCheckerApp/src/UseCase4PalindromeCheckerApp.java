public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        char[] charArray = str.replaceAll("[\W_]+", "").toLowerCase().toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}