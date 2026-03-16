class PalindromeTwoPointer {
    public static void main(String[] args) {
        String word = "madam";

        // 1. Convert string to char[]
        char[] charArray = word.toCharArray();

        int left = 0;                  // Start pointer
        int right = charArray.length - 1; // End pointer
        boolean isPalindrome = true;

        // 2. Two-pointer approach
        while (left < right) {
            // 3. Compare start & end characters
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Mismatch milte hi exit!
            }
            left++;  // Move forward
            right--; // Move backward
        }

        if (isPalindrome) {
            System.out.println("It's a Palindrome! ✅");
        } else {
            System.out.println("Not a Palindrome. ❌");
        }
    }
}