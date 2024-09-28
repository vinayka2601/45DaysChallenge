package DSAstreak;

public class twoPower {
    public static void main(String[] args) {
        int n=8;
        int b=2;
        for(int i=0;i<n;i++){
             b=b*2;
             System.out.println(b);
             if(n==b){
            System.out.println("this is pow of 2");
            break;
             }
        }
        
    }
}
