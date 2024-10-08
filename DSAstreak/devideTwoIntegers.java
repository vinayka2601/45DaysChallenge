package DSAstreak;

public class devideTwoIntegers {
    public static int dev(int devident,int devisior){
        if(devident==Integer.MIN_VALUE && devisior==-1){
            return  Integer.MAX_VALUE;
        }
        else if(devident==Integer.MIN_VALUE && devisior==1){
            return -Integer.MAX_VALUE;
        }
        int count=0;
        int devi=Math.abs(devisior);
        int divi=Math.abs(devident);
         
        while(divi>=devi){
            divi=divi-devi;
            count++;
        }
       
       
        if(devisior<0 && devident >0 || devisior >0 && devident <0){
            return -count;
        }
        return count;
      
    }
    public static void main(String[] args) {
        int devident=-2147483648;
        int devisior=1;
        System.out.println(dev(devident, devisior));
       
    }
}
