package DSAstreak;

public class TwoPointer {
   
    public static void main(String[] args) {
        int arr[]={-1,2,-3,-3,-5,0,-2};
        int st=0;
        int mi=0;
        while(mi<arr.length){
            if(arr[mi]<0){
                int temp=arr[mi];
                arr[mi]=arr[st];
                arr[st]=temp;
                st++;
                
            }
            mi++;
           
        }
        for(int num : arr){
            System.out.print(num);
        }
       
       
    }
}
