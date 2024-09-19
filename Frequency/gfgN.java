package Frequency;

public class gfgN {
    int getCount (String S, int N){
        // boolean visited=true;
         int Scnt=0;
          int n=S.length();
         for(int i=0;i<n;i++){
             // if(visited){
             //     continue;
             // }
             int count=1;
             for(int j=i+1;j<n;j++){
                 if(S.charAt(i) == S.charAt(j)){
                     //visited=true;
                     count++;
                 }
             }
             if(count==N){
                 Scnt++;
             }
         }
         return Scnt;
     }
}
