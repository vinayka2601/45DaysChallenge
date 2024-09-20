package DSAstreak;

import java.util.Arrays;

public class prefixSum {
    public static int prefixsum(int arr[],int l,int r){
        int prex[]=new int[arr.length];
        int sum=0;
       
        for(int i=0;i<arr.length;i++){
        //     arr[0]=prex[0];
        //   prex[i]=prex[i-1]+arr[i];
           sum+=arr[i];
           prex[i]=sum; 
        }
        System.out.println(Arrays.toString(prex));
           if(l>0 ) sum=prex[r]-prex[l-1]; 
           else sum=prex[r];
        
        return sum;
    }
    public static void main(String[] args) {
        int l=2;
        int r=2;
        int arr[]={13839,2857,37,400,545,611};
        System.out.println(prefixsum(arr, l, r));;
        
        
        
        
    }
}
