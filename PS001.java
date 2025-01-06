import java.util.Scanner;

class Employee{
    int id;
    String firstName;
    String lastName;
    String address;
    Employee(){
        this(0, null, null, null);
    }
    Employee(int id, String firstName, String lastName, String address){
        this.id=id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.address=address;
    }
    String getFullName(){
        return firstName+" "+lastName;
    }
}
class PS001{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id = 100;
        String firstName = "SravanthiReddy"; 
        String lastName = "Gangapuram";
        String address = "Bodampahad";
        Employee emp1 = new Employee();
        System.out.println("Default constructor:\nFull name : "+emp1.getFullName());
        Employee emp = new Employee(id, firstName, lastName, address);
        System.out.println("Parameterized constructoer:\nFull name : "+emp.getFullName());

    }
}
