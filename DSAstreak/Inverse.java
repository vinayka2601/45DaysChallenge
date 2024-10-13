package DSAstreak;

public class Inverse {
    public static void main(String[] args) {
        //21453  me peeche se agar 1st position me 3 hai to inverse me third position me 1 hoga aisa karke question solve karna hai.
        int num=21453;
        int posi=0;
        int inv=0;
        while(num!=0){
            int dig=num%10;
            posi++;
            int digit=dig;
            inv=inv+posi*(int)Math.pow(10,digit-1);
            num=num/10;
        }
        System.out.println(inv);
    }
}
