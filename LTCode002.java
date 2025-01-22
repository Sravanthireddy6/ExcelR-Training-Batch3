public class LTCode002 {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result * 10 + digit;
        }
        
        return result;
    }

    public static void main(String[] args) {
        LTCode002 solution = new LTCode002();
        System.out.println(solution.reverse(123)); 
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120)); 
        System.out.println(solution.reverse(0));
        System.out.println(solution.reverse(1534236469)); 
    }
}