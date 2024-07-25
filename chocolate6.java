import java.util.ArrayList;
import java.util.Collections;

public class chocolate6 {
     public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long res=Long.MAX_VALUE;;
        
        for(int i=0;i<n-m+1;i++){
            int maxvalue=a.get(i+m-1);
            int minvalue=a.get(i);
            res=Math.min(res,maxvalue-minvalue);
        }
        return res;
    }
}
