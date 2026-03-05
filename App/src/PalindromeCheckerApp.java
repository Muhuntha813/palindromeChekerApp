class PalindromeCharArray {

    public static void main(String[] args) {

        String word = "radar";   // string to check

        // Convert string to character array
        char[] ch = word.toCharArray();

        int start = 0;
        int end = ch.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (ch[start] != ch[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}