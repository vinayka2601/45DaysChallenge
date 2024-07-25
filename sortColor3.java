public class sortColor3 {
    public void sortColors(int[] nums) {
        int n=nums.length;
        boolean swaped;
        for(int i=0;i<n-1;i++){
          swaped = false;
          for(int j=0;j<n-i-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                swaped =true;
            }
          }
          if(swaped ==false){
            break;
          }
        
    
    }
}
}
