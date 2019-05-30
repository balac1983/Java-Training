package basic;

public class SumofNumbers {
	public static void main(String[] args)
	{
		System.out.println(sum(2));
		
	}
	public static int sum(int n) {
		int sumofnum =0;
		for(int i=0; i<=n;i++) {
			sumofnum= sumofnum+i;
			}
		return sumofnum;
	}
	public static int sumfrominst(int[] numbers) {
	    int sum=0;
	    for (int i = 0; i < numbers.length; i++) {
	        sum=sum+numbers[i];
	    }
	    return sum;
	}
	
	
}


