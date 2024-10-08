package DSAstreak;

public class countSetBit {
    public static int countBit(int n){
       
            int count=0;
        while(n>0){
            n =n & (n-1);
            count++;
        }
        return count;    
        } 
        public static int countSetBits(int n){
            int ct=0;
       for(int i=1;i<=n;i++){
        ct+=countBit(i);
      }
    return ct;
       }
    
    public static void main(String[] args) {
        int n=3;
        System.out.println(countSetBits(n));
    }
}
