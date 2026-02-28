
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "malayalam"; // Test word

        // 1. Two Pointer Approach
        long startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long endTime = System.nanoTime();
        long duration1 = endTime - startTime;

        // 2. Stack Approach
        startTime = System.nanoTime();
        boolean result2 = stackCheck(word);
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;

        // 3. Deque Approach
        startTime = System.nanoTime();
        boolean result3 = dequeCheck(word);
        endTime = System.nanoTime();
        long duration3 = endTime - startTime;

        // Display Results
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + duration1 + " ns");
        System.out.println("Stack Result: " + result2 + " | Time: " + duration2 + " ns");
        System.out.println("Deque Result: " + result3 + " | Time: " + duration3 + " ns");
    }

    // Two Pointer Method
    public static boolean twoPointerCheck(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Stack Method
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}
