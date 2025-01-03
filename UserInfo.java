import java.util.Scanner;
public class UserInfo {
    public static void main(String[] args){
        String Name;
        int Age;
        long PhoneNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        Name= sc.nextLine();
        System.out.println("Please Enter Your Age");
        Age= sc.nextInt();
        System.out.println("Please Enter Your PhoneNumber");
        PhoneNumber= sc.nextLong();
        System.out.println("Hello" +Name+  "Your Age is" +Age+  "Your PhoneNumber is"  +PhoneNumber);
    }
    
}
