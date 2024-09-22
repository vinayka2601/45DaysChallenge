package DSAstreak;
import java.util.*;
public class jewels {
    public static int numJewelsInStones(String jewels, String stones) {
     HashMap <Character,Integer> hash=new HashMap<>();
     int count=0;
     for(char c : stones.toCharArray()){
        hash.put(c,count);
     }
     for(char jwl :jewels.toCharArray()){
        if(hash.containsKey(jwl)){
            count++;
            hash.put(jwl,count);
        }
     }
     return count;
    }
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
