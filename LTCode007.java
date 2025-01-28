public class LTCode007 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        LTCode007 solution = new LTCode007();
        
        int[][] testCases = {
            {1, 2, 3},
            {4, 3, 2, 1},
            {9},
            {9, 9, 9}
        };

        for (int[] digits : testCases) {
            int[] result = solution.plusOne(digits);
            for (int digit : result) System.out.print(digit + " ");
            System.out.println();
        }
    }
}