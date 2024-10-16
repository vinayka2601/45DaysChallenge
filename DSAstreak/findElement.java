package DSAstreak;

public class findElement {
   public static void main(String[] args) {
    int arr[]={1,2,4,3,66,77,5,6,7};
    int k=77;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==k){
            System.out.println(i);
        }
    }
   } 
}
