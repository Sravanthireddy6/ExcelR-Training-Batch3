public class Demo080 {
    public static void shiftArrayLeft(int[] array) {
        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        printArray(numbers);
        shiftArrayLeft(numbers);
        System.out.println("Array After Shifting Left:");
        printArray(numbers);
    }
}