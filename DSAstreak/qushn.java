package DSAstreak;

public class qushn {
    public static void isevod(int arr[],int n){
     for(int i=0;i<n;i++){
      int count=0;
      //String.valueOf(arr[i]).length() = this is for 123.. values
      for(int j=0;j<String.valueOf(arr[i]).length();j++){
           count++;
      }
      if(count%2==0){
        System.out.println("this is even");
      }else{
        System.out.println("odd");
      }
     }
    }
    public static void main(String[] args) {
        int arr[]={123,46,3638,7};
        int n=arr.length;
        isevod(arr, n);

    }
}
