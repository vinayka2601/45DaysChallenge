import java.util.Arrays;

public class moveZeroA7 {
    public static void moving(int[]nums){
        int size=nums.length;
        if(size==0||size==1){
            return;
        }
        int nz=0,z=0;
        while(nz<size){
         if(nums[nz]!=0){
            int temp=nums[z];
            nums[z]=nums[nz];
            nums[nz]=temp;
            z++;
            nz++;
         }else{
            nz++;
         }
        }
        
    }
    public static void main(String[] args) {
        int nums[]={0,22,3,0,5,0};
       moving(nums);
       
    //    for (int i = 0; i < nums.length; i++) {
    //     System.out.print(nums[i] + " ");}

        System.out.println(Arrays.toString(nums));
    
        

    }
}
