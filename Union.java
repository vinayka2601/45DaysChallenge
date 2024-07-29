public class Union {

    public static void unionArr(int arr[],int nums[],int m,int n){
       
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
        
        while(p1>=0 && p2>=0){
            if(arr[p1]<nums[p2]){
                arr[p--]=nums[p2--];
            }else{
                arr[p--]=arr[p1--];
            }
        }
        while(p2>=0){
            arr[p--]=nums[p2--];
          }
          
    }
    public static void Remduplic(int arr[],int m,int n) {
        int rd=0;
        for(int i=1;i<=m+n;i++){
        if(arr[rd]!=arr[i]){
            rd++;
            arr[rd]=arr[i];
        }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,0,0,0,0,0,0};
        int nums[]={1,2,3,4,5,6};
        int m=arr.length;
        int n=nums.length;
        Remduplic(arr, m, n);
        unionArr(arr, nums,m,n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
       
    }
}
