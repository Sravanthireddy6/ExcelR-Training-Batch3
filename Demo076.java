public class Demo076 {

    public int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
    public static void main(String[] args) {
        Demo076 demo = new Demo076();
        int[] arr = {12, 45, 78, 23, 56, 89, 11};
        int secondMax = demo.findSecondMax(arr);
        System.out.println("The second maximum number in the array is: " + secondMax);
    }
}