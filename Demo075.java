public class Demo075 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 23, 56, 89, 11};
        int max = findMax(arr);
        System.out.println("The maximum number in the array is: " + max);
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }
        return max;
    }
}