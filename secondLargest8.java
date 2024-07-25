public class secondLargest8 {
    public static int secondLargest(int a[],int n){
        int largest=a[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }else if(a[i]<largest &&  a[i]>slargest){
             slargest=a[i];
            }
        }
        return slargest;
        }
         public static int secondSmallest(int a[],int n){
            int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            }else if(a[i]!=smallest &&  a[i]<ssmallest){
             ssmallest=a[i];
            }
        }
        return ssmallest;
        }
        public static int[] getSecondOrderElements(int n, int []a) {
            int seclargesto=secondLargest(a,n);
            int secsmallesto=secondSmallest(a,n);
            int arr[]=new int[2];
            arr[0]=seclargesto;
            arr[1]=secsmallesto;
            return arr;
        }
}
