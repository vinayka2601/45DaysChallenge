package Frequency;

public class frequency {
    public static void frq(int arr[]){
        boolean visited[]=new boolean[arr.length];
       
     for(int i=0;i<arr.length;i++){
        
        if(visited[i]==true){
            continue;
        }
        int count=1;
        for(int j=i+1;j<arr.length;j++){
           
            if(arr[i]==arr[j]){
              visited[j]=true;
              count++;
            }
            
        }
        System.out.println(arr[i]+" ki freq hai "+count);
      
     }
    
     
    }
    public static void main(String[] args) {
        int arr[]={10,20,10,25,5,20,20,25};
        frq(arr);
        
    }
}
