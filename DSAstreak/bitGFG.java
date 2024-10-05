package DSAstreak;

public class bitGFG {
    class Solution {
        static void bitManipulation(int num, int i) {
            int mask=1<<(i-1);
            int env=~mask;
            System.out.print(((num & mask) !=0 ? 1 :0 )+" ");
             System.out.print((num | mask) +" ");
            System.out.print((num & env) +" ");
    
            
        }
    }
}
