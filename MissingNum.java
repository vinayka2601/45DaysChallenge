public class MissingNum {
    public static int missingNumber(int []a, int N) {
        int sum2=0;
         int sum1=(N*(N+1))/2;
         for(int i=0;i<N-1;i++){
          sum2=sum2+a[i];
         }
         return (sum1-sum2);
        }
}
