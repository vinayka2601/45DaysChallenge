import java.util.ArrayList;

public class rearrange {
    public int[] rearrangeArray(int[] nums) {
    //     int posIdx=0;
    //     int negIdx=1;
    //     int arr[] =new int[]{nums.length};
    //    for(int i=0;i<nums.length;i++){
    //   if(nums[i]<0){
    //     arr[negIdx]=nums[i];
    //     negIdx+=2;
    
    //   }else{
    //      arr[posIdx]=nums[i];
    //     posIdx+=2;
    //   }
    //    }
    // return arr;
    
    ArrayList<Integer> arr=new ArrayList<>();
         int posIdx=0;
         int negIdx=1;
for(int i : nums){
    if(nums[i]<0){
     arr.add(nums[i]);
     negIdx+=2;
        
    }else{
        arr.add(nums[i]);
        posIdx+=2;
       
    }
}
return arr;
        }
}
