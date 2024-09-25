package DSAstreak;

import java.util.HashMap;

public class freqhashChar {
    public static void strFreq(String str){
      HashMap<Character ,Integer> hm=new HashMap<>();
      for(char val:str.toCharArray()){
       if(hm.containsKey(val)){
        hm.put(val,hm.get(val)+1);
       }else{
        hm.put(val,1);
       }
      }
     hm.forEach((key,value)->{
        System.out.println("charater"+"|"+"frequency");
        System.out.println(key+"          "+value);
     });
    }
    public static void main(String[] args) {
        String str="He said I am Groot";
        strFreq(str);
//number 4 is counted as a spaces in between the words.
    }
}
