import java.util.Scanner;

public class Demo052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0, temp = number, digits = (int) Math.log10(number) + 1;
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        
        System.out.println(number == sum ? number + " is an Armstrong number." : number + " is not an Armstrong number.");
    }
}