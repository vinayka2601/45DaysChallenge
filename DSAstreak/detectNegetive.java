package DSAstreak;

public class detectNegetive {
    public static boolean check(int n,int m){
        return ((n^m)<0); 
    }
    public static void main(String[] args) {
        int n=8,m=-7;
        System.out.println(n^m);
        if(check(n,m)==true){
           System.out.println("opposite sign");
        }else{
            System.out.println("same sign");
        }
    
    }
}
