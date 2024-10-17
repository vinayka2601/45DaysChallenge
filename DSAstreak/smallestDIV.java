package DSAstreak;

public class smallestDIV {

    public int smallestDivisor(int[] nums, int threshold) {

        int max=Integer.MIN_VALUE;;
          for(int i=0;i<nums.length;i++){
               max=Math.max(max,nums[i]);
          }
          for(int d=1;d<=max;d++){
              int sum=0;
              for(int j=0;j<nums.length;j++){
                sum+=Math.ceil((double)(nums[j]) / (double)(d)); 
              }
               if(sum<=threshold){
                  return d;
                 }
          }
          return -1;
      }
}
