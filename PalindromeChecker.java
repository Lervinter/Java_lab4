public class PalindromeChecker {

    public static boolean isPalindrome(String word) {

        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();


        int length = cleanedWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word1 = "level";
        String word2 = "Java";

        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
    }
}