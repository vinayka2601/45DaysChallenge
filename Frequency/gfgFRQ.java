package Frequency;

public class gfgFRQ {
    int findFrequency(int Arr[], int X){
        int n=Arr.length;
        int count=0;
       for(int i=0;i<n;i++){
           if(Arr[i]==X){
               
                count++;
                   }
               
           }
       
       return count;

      
       
       
       
   }
}
