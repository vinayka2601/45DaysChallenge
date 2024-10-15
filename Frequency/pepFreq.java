package Frequency;

public class pepFreq {
    public static void main(String[] args) {
        int n=1292272;
        int k=2;
        int count=0;
        while(n>0){
            int div=n%10;
            if(div==k){
                count++;
            }
            n=n/10;
           
        }
        System.out.println(count);
    }
}
