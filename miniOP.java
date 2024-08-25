public class miniOP {
    public int minimumOperations(int[] nums) {
        int count = 0;
      for (int num : nums) {
          if (num % 3 != 0) {
              count += Math.min(num % 3, 3 - num % 3);
          }
      }
      return count;
  }
}
