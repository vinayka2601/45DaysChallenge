package DSAstreak;

public class trialZero {
    public int solve(int A) {
        //last k zero ko count karna hai
        int count=0;
        while((A & 1)==0 && A!=0 ){
            count++;
            A>>=1;
        }
        return count;
    }
}
