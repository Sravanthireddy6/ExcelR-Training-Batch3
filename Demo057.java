import java.util.Scanner;

public class Demo057 {

    public static int sumFirstAndLast(int number) {
        
        int lastDigit = number % 10;
       
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;  
        }
        
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = sumFirstAndLast(number);
        
        System.out.println("Sum of first and last digits: " + result);
        
        scanner.close();
    }
}
