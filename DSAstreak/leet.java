package DSAstreak;

public class leet {
    public int sumOfUnique(int[] nums) {
        int sum=0;
       for(int i=0;i<nums.length;i++){
           boolean isUniq=true;
           for(int j=0;j<nums.length;j++){
               if(i!=j && nums[i]==nums[j]){
                   isUniq=false;
               }
           }
           if(isUniq){
               sum+=nums[i];
           }
       }
       return sum;
   }
}
