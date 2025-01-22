public class LTCode001{
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
        public static void main(String[] args) {
        LTCode001 solution = new LTCode001();
        
        // Test cases
        int[] testNumbers = {121, -121, 10, 12321, 0};
        
        for (int num : testNumbers) {
            System.out.println("Is " + num + " a palindrome? " + solution.isPalindrome(num));
        }
    }
}