class NormalizedPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("It's a Palindrome! ✅");
        } else {
            System.out.println("Not a Palindrome. ❌");
        }
    }
}