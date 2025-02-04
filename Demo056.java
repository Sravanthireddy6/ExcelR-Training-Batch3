import java.util.Scanner;

public class Demo056 {

    public static int sumOfCubes(int number) {
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10; 
            sum += digit * digit * digit; 
            number = number / 10; 
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = sumOfCubes(number);
      
        System.out.println("Sum of cubes of digits: " + result);
        
        scanner.close();
    }
}
