import java.util.Arrays;

public class leetcode3131 {
    public int addedInteger(int[] nums1, int[] nums2) {
        int deff=Integer.MAX_VALUE;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       for(int i=0;i<nums1.length;i++){
             deff=nums2[i]-nums1[i];
                 
       }
       return deff;
}
}
