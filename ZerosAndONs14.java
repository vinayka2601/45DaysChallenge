import java.util.ArrayList;

public class ZerosAndONs14 {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low=0,mid=0,heigh=n-1;
        while(mid<=heigh){
            if(arr.indexOf(mid)==0){
                int temp=arr.get(low);
                arr.add(low,arr.get(mid));
                arr.add(mid,temp);;
                low++;
                mid++;
               
            }else if(arr.get(mid)==1){
                mid++;
            }else{
             int temp=arr.get(mid); 
             arr.add(heigh,arr.get(mid));
             arr.add(heigh,temp);;
                heigh--;
            }
             System.out.println(arr);
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,2,1,1,0,2};
        ArrayList<Integer> yoy =new ArrayList<>();
       for(int i : arr){
        yoy.add(i);
       }
       sortArray(yoy, arr.length);
    // System.out.println(yoy.get(4));
    }
}
