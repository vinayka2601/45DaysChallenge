import java.util.*;
public class Divisior {
        public static List< Integer > printDivisors(int n) {
            List<Integer> divisors = new ArrayList<>();
            //whenever it gives us LIST we can creat another List and perform the algo
            for(int div=1;div<=10;div++){
                if(n%div==0){
                    divisors.add(div);
                }
               
            }
             return divisors;
        
}
}
