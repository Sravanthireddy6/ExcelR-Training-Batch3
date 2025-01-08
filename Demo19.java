import java.util.Scanner;
public class Demo19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int roundedNumber = (int) (Math.round((double) number / 5) * 5);
        System.out.println("The number " + number + " rounded to the nearest multiple of 5 is: " + roundedNumber);
        scanner.close();
    }
}
