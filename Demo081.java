public class Demo081 {
    public static void printLeaderElements(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (array[i] <= array[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {16, 17, 4, 3, 5, 2};
        System.out.println("Leader elements of the array:");
        printLeaderElements(numbers);
    }
}