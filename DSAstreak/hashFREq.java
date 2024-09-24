package DSAstreak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashFREq {
    public static void findFREq(int nums[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
                //hm.get(num[i]+1) will update num[i] count by 1 
            }else{
                hm.put(nums[i],1);
            }
        }
        //entrySet loop
        for(Map.Entry entry :hm.entrySet()){
            System.out.println("number | frequency");
            System.out.println("  "+entry.getKey()+"     "+entry.getValue());
        }
        //without entrySet loop
        System.out.println("number | frequency");
        hm.forEach((key, value) -> {
            System.out.println("  " + key + "        " + value);
        });
    }
        public static void main(String[] args) {
        int nums[]={1,2,3,2,4,5,4};
        findFREq(nums);
       
    }
}
