class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";


        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a Palindrome! ✅");
        } else {
            System.out.println(word + " is not a Palindrome. ❌");
        }
    }
}