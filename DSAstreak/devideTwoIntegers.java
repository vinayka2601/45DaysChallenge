package DSAstreak;

public class devideTwoIntegers {
    public static int dev(int devident,int devisior){
        int count=0;
        while(devident>0){
            devident=devident-devisior;
            count++;
        }
        if(devident==0){
            return count;
        }
        return devident;
    }
    public static void main(String[] args) {
        int devident=6;
        int devisior=2;
        System.out.println(dev(devident, devisior));
       
    }
}
