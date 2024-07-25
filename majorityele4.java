public class majorityele4 {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
     int n = nums.length;
     int count = 1;
 
     for (int i = 0; i < n ; i++) {
         if (nums[i] == maj) {
             count++;
         } else {
             count--;
         }
         if (count==0) {
             maj=nums[i];
             count=1;
         }
       }
       return maj;
     }
}
