public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
       if(nums.length==1){
        return nums;
       }
        for(int i=1;i<=nums.length-1;i++){
            sum[0]=nums[0];
        nums[i]=nums[i-1]+nums[i];
        sum[i]=sum[i]+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(runningSum(nums));
    }
}
