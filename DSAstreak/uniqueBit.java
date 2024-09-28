package DSAstreak;

public class uniqueBit {
    public static int fun(int arr[]){
        int unique=0;
        for(int i=0;i<arr.length;i++){
          unique^=arr[i];
        }
        // becaue a^a=0
        //      a^0=a     so it will cancel out the same element and we'll get the unique element
        return unique;
    }
    public static void main(String[] args) {
        int arr[]={7,2,3,3,4,4,7};
        System.out.println(fun(arr));
        
    }
}
