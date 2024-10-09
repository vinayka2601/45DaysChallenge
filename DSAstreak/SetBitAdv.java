package DSAstreak;

public class SetBitAdv {
    public static int nearpow(int n){
        int x=0;
        while((1<<x)<=n){
         x++;

        }
        return x-1;
    }
   public static int set(int n){
       int c=0;
       while(n>0){
        int x=nearpow(n);
        int sumuptox = (1<<(x-1))*x;
        c+=( n - (1<<x) + 1) + sumuptox; 
         n = (n-(1<<x));

       }
       return c;
    }
    
    public static void main(String[] args) {
        int n=8;
        System.out.println(set(n));;
    }
}
