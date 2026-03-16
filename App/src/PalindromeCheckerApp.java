import java.util.ArrayDeque;
import java.util.Deque;

class PalindromeDeque {
    public static void main(String[] args) {
        String word = "racecar";
        Deque<Character> deque = new ArrayDeque<>();

        // 1. Insert characters into deque
        for (char c : word.toCharArray()) {
            deque.addLast(c); // Piche se add kiya
        }

        boolean isPalindrome = true;

        // 2. Remove first & last and Compare
        // Jab tak deque mein 1 se zyada character hai
        while (deque.size() > 1) {
            char first = deque.removeFirst(); // Front se nikaala
            char last = deque.removeLast();   // Rear se nikaala

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome! 🔄");
        } else {
            System.out.println(word + " is not a Palindrome. ❌");
        }
    }
}