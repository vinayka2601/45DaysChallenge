package DSAstreak;

import java.util.List;

public class posibalPair {
     public int countPairs(List<Integer> nums, int target) {
        int c=0;
        int n=nums.size();
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                    int pair=nums.get(i)+nums.get(j);
                    if(pair<target){
                        c++;
                    }    
            }
        }
        return c;
    }
}
