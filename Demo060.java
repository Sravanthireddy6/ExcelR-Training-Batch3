public class Demo060 {
    public static void main(String[] args) {
        int n = 20; 
        long first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + n + " numbers:");
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) {
            long next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}