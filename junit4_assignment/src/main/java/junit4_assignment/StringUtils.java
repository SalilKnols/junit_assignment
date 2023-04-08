package junit4_assignment;

public class StringUtils {
    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int index = str.length() - 1; index >= 0; index--) {
            reversedString.append(str.charAt(index));
        }
        return reversedString.toString();
    }

    public static boolean isEmpty(String emptyString) {
        return emptyString == null || emptyString.trim().isEmpty();
    }

    public static boolean isPalindrome(String palindromeString) {
        if (palindromeString == null) {
            return false;
        }
        palindromeString = palindromeString.toLowerCase();
        int front = 0;
        int back = palindromeString.length() - 1;
        while (front < back) {
            if (palindromeString.charAt(front) != palindromeString.charAt(back)) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
