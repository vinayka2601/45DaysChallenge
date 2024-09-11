package PRIMEnum;

import java.util.ArrayList;

public class PrimeFactor {
    public static boolean isprime(int n){

        //brutForce
        int cnt=0;
        if(n<=1){
            return false;
        }
        for(int i=1;i*i<=n;i++){
            if(n%i==0){ 
               // System.out.println(i);
                cnt++;
                if(n/i!=i){
                  
                   cnt++; 
                 //  System.out.println(n/i); 
                   
                }
            }
        }
        if(cnt==2){
            return true;
        }else{
            return false;
        }

    }
    public static void factors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){

                if(isprime(i)){
                     //System.out.println(i);
                    list.add(i);
                    System.out.println(list);
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=78;
        
      // System.out.println(brutForce(n)); ;
      //brutForce(n);
      factors(n);
     
}
}