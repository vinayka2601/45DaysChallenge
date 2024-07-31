import java.util.ArrayList;

public class removeDupli1 {
    public static int removeDuplicates(int[] nums) {
        ArrayList <Integer> list =new ArrayList<>();

        int k=0;
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[k]!=nums[i]){
        //         k++;   
        //      nums[k]=nums[i]; 
               
        //     }
        // }

       for(int i : nums){
        if(! (list.contains(i))){
            list.add(i);

        }
       }

         System.out.println(list);
        return k+1;
        // k=0 k=1
        //i=1  i=1
       
}
public static void main(String[] args) {
    int nums[]={0,0,1,1,1,2,2,3,3,4};
   
     removeDuplicates(nums);
    // for(int num : nums){
    //     System.out.print(num);
    // }
    
}
}
