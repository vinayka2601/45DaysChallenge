import java.util.*;
public class Divisior {
        public static List< Integer > printDivisors(int n) {
            List<Integer> divisors = new ArrayList<>();
            //whenever it gives us LIST we can creat another List and perform the algo
            for(int div=1;div<=n;div++){
                if(n%div==0){
                   // System.out.println(div);
                    divisors.add(div);
                }
               
            }
             return divisors;
        
}
public static void main(String[] args) {
    int n=12;
    System.out.println(printDivisors(n));;
}
}
