 class MethodOverloadingExample {
    public int add(int a) {
        return a + 10;
    }
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Demo054{
    public static void main(String[] args) {
         MethodOverloadingExample example = new MethodOverloadingExample();

        System.out.println("Add one integer: " + example.add(5));          
        System.out.println("Add two integers: " + example.add(5, 3));      
        System.out.println("Add two doubles: " + example.add(5.5, 3.3));
        System.out.println("Add three integers: " + example.add(5, 3, 2)); 
    }
}
