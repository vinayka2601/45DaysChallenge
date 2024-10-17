package DSAstreak;

public class addTwoArr {
    public static void main(String[] args) {
          int a1[]={8,3,4,2};
          int n1=a1.length;
          int a2[]={5,6,7};
          int n2=a2.length;
        int sum[]=new int[n1>n2?n1:n2];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;
              int c=0;
        while(k>=0){
            int d=c;
            if(i>=0){
            d+=a1[i];
            }
            if(j>=0){
                d+=a2[j];
            }
            c=d/10;
            d=d%10;

            sum[k]=d;
            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.println(c);
        }
        for(int val: sum){
            System.out.print(val);
        }
        
        }
    }

