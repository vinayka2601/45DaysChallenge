package DSAstreak;
import java.util.*;
public class abcd {
    public static boolean checkIfPangram(String sentence) {
       HashMap<Character,Boolean> word = new HashMap<>(); 
         for(char c='a';c<='z';c++){
            word.put(c,false);
         }
         for(char c : sentence.toLowerCase().toCharArray()){
           if(word.containsKey(c)){
              word.put(c,true);
           }

         }
         for(boolean value : word.values()){
            if(!value){
                return false;
            }
         }
         return true;
    }
    public static void main(String[] args) {
        String sentence="abcdefghijklmnopqrstuvwxyz";
        System.out.println(checkIfPangram(sentence));;
    }
}
