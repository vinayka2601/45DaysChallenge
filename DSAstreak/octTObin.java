package DSAstreak;

public class octTObin {
    public static int octTOdeci(int n){
        int p=1;
        int ans=0;
        while(n>0){
            int dig=n%10;
            n=n/10;

            ans+=p*dig;
            p=p*8;

        }
        return ans;
    }
    public static int DeciToBin(int n){
        int val=octTOdeci(n);
        int an=0;
        int p=1;
        while(val>0){
            int dig=val%2;
            val=val/2;
            an+=p*dig;
            p=p*10;

        }
        return an;
    }
    public static void main(String[] args) {
        int n=1172;
        System.out.println(DeciToBin(n));
       // System.out.println(octTOdeci(n));
        

    }
}
