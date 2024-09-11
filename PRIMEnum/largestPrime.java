package PRIMEnum;

import java.util.ArrayList;

public class largestPrime {
    class Solution{
    static boolean isprime(int N){
        int cnt=0;
        long i;
        for( i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){
               cnt++;
                if(N/i!=i){
                    cnt++;
                }
            }
        }
         if(cnt==2){
             return true;
             
         }else{
             return false;
         }
    }
    static long largestPrimeFactor(int N) {
        ArrayList <Integer> li=new ArrayList<>();
        for(int i=2;i<=N;i++){
            if(N%i==0){
                if(isprime(i)){
                   li.add(i);
                }
            }
        }
        return  li.get(li.size()-1);
    }
}
}
