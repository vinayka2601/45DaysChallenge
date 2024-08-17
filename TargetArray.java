import java.util.ArrayList;

public class TargetArray {
     public static int[] createTragetArr(int nums[],int index[]){
        ArrayList <Integer> target =new ArrayList<>();
             int n=nums.length;
             if(nums.length==1){
                return nums;

             }
             for(int i=0;i<n;i++){
                target.add(index[i],nums[i]);
             }
             int result[]=new int[n];
             for(int i=0;i<n;i++){
               result[i]=target.get(i);
             }
             return result;
     }
}
