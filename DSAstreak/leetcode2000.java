package DSAstreak;

public class leetcode2000 {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        if(idx==-1){
            return word;
        }
        char[] st=word.toCharArray();
            int start=0;
            int end=idx;
         while(start<end){
          char temp=st[start];
          st[start]=st[end];
          st[end]=temp;
          start++;
          end--;
         }
          
    return new String(st);
}
}
