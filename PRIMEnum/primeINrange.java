package PRIMEnum;

public class primeINrange {
    public static boolean isprime(int n){
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
        }
        if(cnt==2){
            return true;
        }else{
            return false;
        }
    }
    public static int rangecheck(int L,int R){
        int count=0;
        for(int n=L;n<=R;n++){
            if(isprime(n)){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int L=5;
        int R=6;
        System.out.println(rangecheck(L, R));

    }
}
