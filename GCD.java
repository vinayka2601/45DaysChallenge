public class GCD {
    public static int gcd(int a,int b)
	{
		int GCD=0;
		for(int i=Math.min(a,b);i>=1;i--){
			if(a%i==0 && b%i==0){
			 GCD=i;
				break;
			}
		}
		return GCD;
	}		
}
