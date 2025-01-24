import java.util.Scanner;
public class Demo35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
