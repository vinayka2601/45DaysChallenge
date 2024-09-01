package PRIMEnum;

import java.util.ArrayList;

public class FactorsPrimnun {
    public class primeCheck {
        public static boolean primechk(int n){
            int count=0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    count++;
                
                if(n/i!=i){
                    count++;
                }
             }
            }
            if(count==2){
                return true;
            }else{
                return false;
            }
            
        }
        public static ArrayList<Integer> fact(int n) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (primechk(i)) {
                        result.add(i);
                    }
                    if (n / i != i && primechk(n / i)) {
                        result.add(n / i);
                    }
                }
            }
            return result;
        }
    public static void main(String[] args) {
        int n=37;
        System.out.println(fact(n));
        
    }
}
}
