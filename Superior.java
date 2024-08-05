import java.util.ArrayList;
import java.util.List;

public class Superior {
     public static List< Integer > superiorElements(int []a) {
        ArrayList <Integer> ans= new ArrayList<>();
         int n=a.length;
         int maxi=Integer.MIN_VALUE;
         for(int i=n-1;i>=0;i--){
           if(a[i]>maxi){
               ans.add(a[i]);
              
           }
            maxi=Math.max(maxi, a[i]);
         }
         return ans;
    }
}
