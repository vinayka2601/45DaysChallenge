import java.util.ArrayList;
import java.util.HashSet;

public class singleNum13 {
     public static int singleNumber(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    // for (int num : nums) {
    //     if (set.contains(num)) {
    //         set.remove(num);
    //     } else {
    //         set.add(num);
    //     }
    // }
    // return set.iterator().next();

    ArrayList<Integer> list =new ArrayList<>();
    for(int num :nums){
        if(list.contains(num)){
            list.remove(Integer.valueOf(num));
        }else{
            list.add(num);
        }
    }
    return list.iterator().next();
    }
    public static void main(String[] args) {
        int nums[]={1,1,2};
        //singleNumber(nums);
        System.out.println(singleNumber(nums));
    }
}
