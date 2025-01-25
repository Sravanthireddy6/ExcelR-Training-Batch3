 import java.util.Scanner;
 public class BankDetails {
    String Cust_Name = "Sravanthi";
    long Account_no = 1234567890;
    Double Balance = 20000.00;
    void accept_details(){
        System.out.println("Enter your name,Account no");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
    }
    void Display_details(){
        System.out.println("Hello" +Cust_Name);
        System.out.println("ur balance is" +Balance);
    }
    public static void main(String[] args){
        BankDetails obj = new BankDetails();
        obj.accept_details();
        obj.Display_details();
    } 
}
