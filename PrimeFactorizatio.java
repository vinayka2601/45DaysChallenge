public class PrimeFactorizatio {
    public static void main(String[] args) {
        int n=1440;
        for(int div=2;div*div<=n;div++){
            while(n%div==0){
                n=n/div;
                System.out.print(div);
            }
        }
        if(n!=1){
          System.out.println(n);//if root n k beyond n kat k 1 ni hua hai to bass vahi ek prime factor bacha hai so print that.
        }
    }
}
