public class rotatePEP {
    public static void rotate(int num[],int k){
        int n=num.length;
        k=k%n;
        if(k<0){
            k=k+n;
        }
        reverse(num, 0, n-1);
        reverse(num, k, n-1);
        reverse(num, 0, k-1);
    }
    public static void reverse(int num[] ,int start,int end){ 
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
       
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        System.out.println(num);
        rotate(num, 2);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
}
