public class assignROT11 {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,n-1,0);
        reverse(nums,n-1,k);
        reverse(nums,k-1,0);
        
    }
    public static void reverse(int[]nums,int start ,int end){
        while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
        }
        
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        System.out.println(nums);
        rotate(nums, 3);
    

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
