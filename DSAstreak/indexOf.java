package DSAstreak;

public class indexOf {
    public static void main(String[] args) {
        String str="hamsehoga";
        
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(str.indexOf(curr)!=str.lastIndexOf(curr)){
                System.out.println(curr+"  is not unique");
            }else{
                System.out.println(curr+"   is unique");
            }
        }
    }
}
