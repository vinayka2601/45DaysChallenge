import java.util.Arrays;

public class TwoSum14 {
      public static String read(int n, int []book, int target){
      
    if (book == null || n < 2) {
        return "no"; 
    }

    Arrays.sort(book);
    int left = 0;
    int right = n - 1;

    while (left < right) {
        int sum = book[left] + book[right];
        if (sum == target) {
            return "YES"; 
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    return "NO"; 
    }

}
