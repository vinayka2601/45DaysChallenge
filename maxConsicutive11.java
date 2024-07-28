public class maxConsicutive11 {
    public static int consecutiveOnes(int n, int[] arr) {
		int count=0;
		int maxi=0;
      
	  for(int i=0;i<n;i++){
       if(arr[i]==1){
		   count++;
		  maxi= Math.max(maxi,count);
	   }else{
		   count=0;
	   }
	  }

		return maxi;
    }
}
