import java.util.ArrayList;

public class RearrangeAr20 {
    public int[] rearrangeArray(int[] nums) {
        ArrayList <Integer> pos=new ArrayList<>();
         ArrayList <Integer> neg=new ArrayList<>();
          int n=nums.length;
          for(int i=0;i<n;i++){
           if(nums[i]>0){
               pos.add(nums[i]);
           }else{
                neg.add(nums[i]);
           }
          }
          for(int j=0;j<n/2;j++){
           nums[2*j]=pos.get(j);
           nums[2*j+1]=neg.get(j);
          }
        
   return nums;
       }
}
