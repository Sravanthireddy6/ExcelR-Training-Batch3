public class LTCode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }

    public static void main(String[] args) {
        LTCode008 solution = new LTCode008();
        int[] nums1 = new int[6]; 
        int m = 3;  
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        
        int[] nums2 = {2, 5, 6};  
        int n = 3; 
        solution.merge(nums1, m, nums2, n);
        System.out.println("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}