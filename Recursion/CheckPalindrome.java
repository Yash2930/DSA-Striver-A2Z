public class CheckPalindrome {

    public boolean palindromeCheck(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }

        // If characters don't match
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call
        return check(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        CheckPalindrome obj = new CheckPalindrome();

        String s = "hannah";

        if (obj.palindromeCheck(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}