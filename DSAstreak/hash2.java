package DSAstreak;

import java.util.HashMap;

public class hash2 {
    public static void onlyone(int nums[],int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
                //hm.get(num[i]+1) will update num[i] count by 1 
            }else{
                hm.put(nums[i],1);
            }
        }
            if(hm.containsKey(n)){
               System.out.println(n+" ki freq hai "+hm.get(n)); 
            }else{
                System.out.println("not in the array");
            }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,3,6,7,4,3,2,8,1,2,1,7,5,1};
        int n=1;
        onlyone(nums, n);
    }
}
