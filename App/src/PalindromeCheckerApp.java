import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromePerformance {

    // Reverse String Method
    public static boolean reverseMethod(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Stack Method
    public static boolean stackMethod(String word) {

        Stack<Character> stack = new Stack<>();

        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : word.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean dequeMethod(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    // Two Pointer Method
    public static boolean twoPointerMethod(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        long startTime, endTime;

        // Reverse Method
        startTime = System.nanoTime();
        reverseMethod(word);
        endTime = System.nanoTime();
        System.out.println("Reverse Method Time: " + (endTime - startTime) + " ns");

        // Stack Method
        startTime = System.nanoTime();
        stackMethod(word);
        endTime = System.nanoTime();
        System.out.println("Stack Method Time: " + (endTime - startTime) + " ns");

        // Deque Method
        startTime = System.nanoTime();
        dequeMethod(word);
        endTime = System.nanoTime();
        System.out.println("Deque Method Time: " + (endTime - startTime) + " ns");

        // Two Pointer Method
        startTime = System.nanoTime();
        twoPointerMethod(word);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (endTime - startTime) + " ns");
    }
}