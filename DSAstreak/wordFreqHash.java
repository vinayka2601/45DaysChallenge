package DSAstreak;

import java.util.HashMap;

public class wordFreqHash {
    public static void wordFrequency(String str){
        HashMap<String ,Integer> hm=new HashMap<>();
        String word[]=str.split(" ");//string poori string array me badal gai
        for(int i=0;i<word.length;i++){
            if(hm.containsKey(word[i])){
                hm.put(word[i],hm.get(word[i])+1);
            }else{
                hm.put(word[i],1);
            }
        }
        hm.forEach((key,value)->{
          System.out.println("String  |   frequency");
          System.out.println();
          System.out.println(key+"               "+value);
        });

    }
    public static void main(String[] args) {
        String str="hello my name is vinayka but my name is tanu also but but vinayka is unique name right what do you think hello";
        wordFrequency(str);

    }
}
