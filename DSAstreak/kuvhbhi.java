package DSAstreak;

import java.util.HashMap;

public class kuvhbhi {
    public static void devanshu(int arr[]) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        //can use this instade

        // for (int i = 0; i < arr.length; i++) {
        //     hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        // }
        
        hm.forEach((key,value)->{
          System.out.println("number | frequency");
          System.out.println("  "+key+"         "+value);
        });  
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,3,4};
        devanshu(arr); 
    }
}
