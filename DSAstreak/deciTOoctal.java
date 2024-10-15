package DSAstreak;

public class deciTOoctal {
    public static int oct(int n,int change){
        int power=1;
        int ans=0;
        while(n>0){
            int dig=n%change;
            n=n/change;
           ans+= dig*power;
           power=power*10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=63;
        int change=8;
        System.out.println(oct(n, change));
       
    }
}
