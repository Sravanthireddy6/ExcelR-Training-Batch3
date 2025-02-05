public class Demo063 {
    public static void main(String[] args) {
       
        int[] arr = {10, 20, 30, 40, 50};

        if (arr.length > 0) {
         
            int sum = arr[0] + arr[arr.length - 1];
            System.out.println("Sum of 1st and last elements: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }
}