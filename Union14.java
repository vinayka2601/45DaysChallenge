import java.util.ArrayList;
import java.util.List;

public class Union14 {
    public static List< Integer > sortedArray(int []arr, int []nums,int m,int n){
        int i=0;
        int j=0;
        ArrayList<Integer> list =new ArrayList<>();
  while(i<m &&j<n){
  if(arr[i]<=nums[j]){
     list.add(arr[i]);
     i++;
  }
  else{
    list.add(nums[j]);
    j++;
  }

  }
  while(j<n){
    list.add(nums[j]);
    j++;
  }
  while(i<m){
    list.add(arr[i]);
    i++;
  }
 
return list;
    }
    
    
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5};
        int nums[]={1,2,3,4,5,6};
        int m=arr.length;
        int n=nums.length;
        
        List<Integer> mergedList = sortedArray(arr, nums, m, n);
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}