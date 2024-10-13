public class lcm_gcd {
    public static void main(String[] args) {
        int n1=36;
        int n2=24;
        int on1=n1;
        int on2=n2;
        while(n1%n2!=0){
            int rem=n1%n2;
            n2=n1;
            n1=rem;
        }
        int GCD=n1;
        int LCM=(on1*on2)/GCD;
        System.out.println("LCM= "+LCM);
        System.out.println("GCD= "+GCD);

    }
}
