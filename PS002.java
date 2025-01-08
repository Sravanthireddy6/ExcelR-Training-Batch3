import java.util.Scanner;

public class PS002 {

    public static int getNextMultipleOf100(int number) {
        // Check if the number is negative or zero
        if (number <= 0) {
            return -1;
        }
        // Calculate the next multiple of 100
        return ((number / 100) + 1) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        // Get the next multiple of 100 and print the result
        int result = getNextMultipleOf100(input);
        System.out.println("Output: " + result);

        scanner.close();
    }
}