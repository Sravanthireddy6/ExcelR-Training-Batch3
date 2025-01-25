import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci series up to " + terms + " terms: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}

