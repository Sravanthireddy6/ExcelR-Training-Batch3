public class Demo074 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
        
        System.out.println("Original array: ");
        printArray(arr);
    
        sortWithoutMethods(arr);
        
        System.out.println("Sorted array: ");
        printArray(arr);
    }
    public static void sortWithoutMethods(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  
    }
}
