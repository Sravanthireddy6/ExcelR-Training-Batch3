public class Demo078 {
    public static void printEvenOddNumbers(int[] numbers) {
        StringBuilder evenNumbers = new StringBuilder();
        StringBuilder oddNumbers = new StringBuilder();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.append(number).append(" ");
            } else {
                oddNumbers.append(number).append(" ");
            }
        }
        System.out.println("Even Numbers: " + evenNumbers.toString().trim());
        System.out.println("Odd Numbers: " + oddNumbers.toString().trim());
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printEvenOddNumbers(numbers);
    }
}