public class Demo079 {
    public static boolean isElementFound(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                return true;  
            }
        }
        return false;  
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int target = 70;
        boolean found = isElementFound(numbers, target);
        if (found) {
            System.out.println("Element " + target + " is found.");
        } else {
            System.out.println("Element " + target + " is not found.");
        }
    }
}