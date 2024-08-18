public class isEqualString {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      
        int n=word1.length;
          String w1con = String.join("", word1);
           System.out.println(""+w1con);

           String w2con = String.join("", word2);
           System.out.println(""+w2con);
        
         if (!w1con.equals(w2con)) {
            return false; 
        }
        
        
        return true;
        
    }
}
