package DSAstreak;

public class RuffPage {
    public static int[] fun(int arr[]){
        int uni=0;
        for(int i=0;i<arr.length;i++){
           uni^=arr[i]; 
        }
        int setbit=uni & -uni;
        int unique1=0,unique2=0;
        for(int num : arr){
            if((num&setbit)==1){
                unique1^=num;
            }else{
                unique2^=num;
            }
        }
        return new int[]{unique1,unique2};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,3};
        int res[]=fun(arr);
        System.out.println(res[0]+" and "+res[1]);

    }
}
