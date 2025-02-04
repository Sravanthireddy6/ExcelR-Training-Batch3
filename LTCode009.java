class LTCode009 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        
        while (low <= high) {
           
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;
            
            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];
            
            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];
          
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
               
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
              
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                
                high = i - 1;
            } else {
              
                low = i + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
        LTCode009 solution = new LTCode009();
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median of nums1 and nums2: " + solution.findMedianSortedArrays(nums1, nums2)); 

        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println("Median of nums1_2 and nums2_2: " + solution.findMedianSortedArrays(nums1_2, nums2_2));  
    }
}