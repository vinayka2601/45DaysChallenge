public class SubArr {
    public static int longestSubarrayWithSumK(int []a, long k) {
         
        long len=0;
       for(int i=0;i<a.length;i++){
           long sum=0;
           for(int j=i;j<a.length;j++){
              
               sum+=a[j];
               if(sum==k){
              len=Math.max(len, j-i+1);
               }
           }
       }
       return (int)len;
   }
}
