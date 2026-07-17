public class palindrome {

    public static boolean isPalindrome(String str) {
        for (int i=0; i<=str.length()/2; i++) {
            int n=str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                //condition not palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String fullName = "racecar"; //true
        // String fullName = "Divyanka";  //false
        // isPalindrome(fullName);
        System.out.println(isPalindrome(fullName));
    }
}


// run 1 for loop till l/2 time complexity is O(n)