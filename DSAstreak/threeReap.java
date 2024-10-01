package DSAstreak;

import java.util.ArrayList;
import java.util.HashMap;

public class threeReap {
    public static int fun(int nums[],int n){
         int arr[]=new int[32];
        
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                if((nums[j] & (1<<i))!=0){
                    arr[i]+=1;
                }
             }
            }
            int res=0;
         for(int i=0;i<arr.length;i++){
           if(arr[i]%3 !=0){
            res |=(1<<i);
           }
         }
      return res;
   }
    public static void main(String[] args) {
        int nums[]={2,2,1,5,1,1,2};
       int n=nums.length;
       System.out.println(fun(nums, n));

    }
}
