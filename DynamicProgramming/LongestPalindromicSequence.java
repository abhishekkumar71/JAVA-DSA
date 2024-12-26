import java.util.*;

public class LongestPalindromicSequence {
    public static int findLongest(String str) {
        int idx = 0;
        String curr = "";
        ArrayList<String> subsequences = findSubsequence(str, idx, curr);
        int maxLen = 0;
        for (String subsequence : subsequences) {
            if (isPalindrome(subsequence)) {
                maxLen = Math.max(maxLen, subsequence.length());
            }
        }
        return maxLen;
    }

    public static boolean isPalindrome(String subsequence) {
        int n = subsequence.length();
        for (int i = 0; i < n / 2; i++) {
            if (subsequence.charAt(i) != subsequence.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<String> findSubsequence(String str, int i, String curr) {
        ArrayList<String> subsequence = new ArrayList<>();
        if (i == str.length()) {
            subsequence.add(curr);
            return subsequence;
        }
        subsequence.addAll(findSubsequence(str, i + 1, curr + str.charAt(i)));
        subsequence.addAll(findSubsequence(str, i + 1, curr));

        return subsequence;
    }

    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findLongest(str));
    }
}
