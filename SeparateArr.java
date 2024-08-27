import java.util.ArrayList;
import java.util.Collections;

public class SeparateArr {

    public static int[] SeparateArr(int nums[]){
        ArrayList<Integer> result=new ArrayList<>();
       for(int num :nums){
        ArrayList<Integer> Digits=new ArrayList<>();
        while(num>0){
            int digit=num%10;
            Digits.add(digit);
            num=num/10;
        }
        Collections.reverse(Digits);
        result.addAll(Digits);
       }
       int arr[]=new int [result.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=result.get(i);
       }
       return arr;
      
    }
    public static void main(String[] args) {
        int nums[]={31,25,83,77};
        System.out.println(SeparateArr(nums));;
    }
}
