package DSAstreak;

public class OctTodeci {
    public static int deci(int n,int change){
        int p=1;
        int ans=0;
        while(n>0){
            int dig=n%change;
            n=n/change;

            ans+=p*dig;
            p=p*8;

        }
        return ans;
    }
    public static void main(String[] args) {
        int n=1172;
        int change=10;
        System.out.println(deci(n, change));
    }
}
