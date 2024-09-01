package PRIMEnum;
//check ---is a prime num if yes return true or false.
public class primeCheck {
    public static boolean primechk(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            
            if(n/i!=i){
                count++;
            }
         }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
        
    }
  public static void main(String[] args) {
    int n=37;
    System.out.println(primechk(n));
  }
}
