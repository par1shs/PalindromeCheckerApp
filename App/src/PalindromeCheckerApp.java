class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

class LinkedListPalindrome {
    public static void main(String[] args) {
        String word = "radar";
        Node head = buildList(word);

        if (isPalindrome(head)) {
            System.out.println("It's a Palindrome! 🔗");
        } else {
            System.out.println("Not a Palindrome. ❌");
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // 1. Fast & Slow Pointer to find middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half in-place
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // 3. Compare Halves
        Node temp = secondHalf; // To keep track for comparison
        while (temp != null) {
            if (firstHalf.data != temp.data) return false;
            firstHalf = firstHalf.next;
            temp = temp.next;
        }
        return true;
    }

    // In-place Reversal Logic
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static Node buildList(String s) {
        Node head = new Node(s.charAt(0));
        Node current = head;
        for (int i = 1; i < s.length(); i++) {
            current.next = new Node(s.charAt(i));
            current = current.next;
        }
        return head;
    }
}