public class RughPage {
    public static int nonREp(int arr[]){
        int uni=0;
            for(int i=0;i<arr.length;i++){
            uni^=arr[i];    
            }
           return uni;
        }
    public static void main(String[] args) {
        int arr[]={5,4,1,4,3,5,1,2};
        //int res[]= nonREp(arr);  
    }
}
