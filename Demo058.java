public class Demo058 {

    public static void printFactors(int number) {
        System.out.print("Factors of " + number + " are: ");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
      
        int number = 12; 
        
        printFactors(number);
    }
}
