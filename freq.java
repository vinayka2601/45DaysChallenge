public class freq {
    public static void frequency(String val){
     int f[]=new int [26];
     for(char i:val.toCharArray()){
        f[i-'a']++;
     }
        for(int i=0;i<f.length;i++){
        if(f[i]>0){
         System.out.println((char)(i+97)+" freq is "+f[i]);
        }
        }
     
    }
    public static void main(String[] args) {
       // char val[]={'a','a','b','c','d','d','d'};
       String val="aabcddd";
       frequency(val);
    }
}
