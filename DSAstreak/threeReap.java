package DSAstreak;

import java.util.ArrayList;
import java.util.HashMap;

public class threeReap {
    public static void fun(int nums[]){
        //int nums[]=new int[32];
        int count=0;
        HashMap <Integer,Integer> hm=new HashMap<>();

       
         for( int num :nums ){
            if(hm.containsKey(num)){
                count++;
                hm.put(num,count);
            }
         }
        if(count%3==0){
          count=0;
        }else{
            count=1;
        }

   hm.forEach((key ,value)->{
    System.out.println(key+""+value);
   });
    
   }
    
    public static void main(String[] args) {
        int nums[]={2,2,1,5,1,1,2};
        fun(nums);

    }
}
