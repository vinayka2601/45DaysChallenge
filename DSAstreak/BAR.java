package DSAstreak;

import java.util.Arrays;

public class BAR {
    public static void main(String[] args) {
        int nums[]={3,1,0,7,5};
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
           
        }
        for(int floor =max;floor>=1;floor--){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=floor){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}
}
