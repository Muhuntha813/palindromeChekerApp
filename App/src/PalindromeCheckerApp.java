class PalindromeIgnoreCase {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        // Normalize string (remove spaces and convert to lowercase)
        text = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = text.length() - 1;

        boolean isPalindrome = true;

        // Compare characters
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }
    }
}