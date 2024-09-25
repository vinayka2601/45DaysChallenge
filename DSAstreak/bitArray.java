package DSAstreak;

import java.util.Arrays;

public class bitArray {
    public int findMinXor(int[] A) {
        //array me pair banake batana hai ki sabsa min xor value kiski hai
         Arrays.sort(A);
        int res=Integer.MAX_VALUE;
       
        for(int i=0;i<A.length-1;i++){
                res= Math.min(res,A[i]^A[i+1]);

        }
        return res;
    }
}
