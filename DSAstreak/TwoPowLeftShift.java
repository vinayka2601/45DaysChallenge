package DSAstreak;

public class TwoPowLeftShift {
    public static void main(String[] args) {
        int n=2;
        int b=64;
        for(int i=0;i<10;i++){
            n=n<<1;
            System.out.println(n);
            if(b==n){
                System.out.println("yes it is");
                break;
            }
        }
    }
}
