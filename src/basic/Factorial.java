package basic;

public class Factorial {
	public static void main(String[] args)
	{
		System.out.println(fac(4));
	}
	public static int fac(int n) {
		int i,fact=1;  
		for(i=1;i<=n;i++){    
		fact=fact*i;    
		}
		return fact;
	}
	public static int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    else if (n == 1) {
	        return 1;
	    }
	    return factorial(n-1) * n;
}
}
