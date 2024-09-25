package DSAstreak;

public class bitONE {
    public int numSetBits(long a) {
        //poore num me 1 kitne baar aye hain
        int count=0;
        while(a>0){
            a= a & (a-1);
             count++;
        }
    return count;
	}
}
