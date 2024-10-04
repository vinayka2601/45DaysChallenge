package DSAstreak;

public class ithBit {
    public static void main(String[] args) {
        int n=8;
        int target=2;
        //for(int i=0;i<n;i++){
           int mask= 1<<target;
           int env= -mask;
           System.out.println(n|mask);
           System.out.println(n&env);


       // }

    }
}
