public class diffDigitElementSum {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
          x=x+nums[i];
          while(nums[i]>0){
           int Lastdigit=nums[i]%10;
           y=y+Lastdigit;
           nums[i]=nums[i]/10;
          }
          
        }
       return Math.abs(x - y);
   }
}
