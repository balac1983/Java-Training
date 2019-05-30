package basic;

public class MinMax {
	public static void main(String[] args)
	{
		int[] min1 = {3,5,8};
		int[] max1 = {3,5,8};
		int[] avg1={3,5,8};
		System.out.println("Minimum Numbers of 3,5,8 is " + min(min1));
		System.out.println("Maximum Numbers of 3,5,8 is " + max(max1));
		System.out.println("Average of 3,5,8 is " + avg(avg1));
	}
	
	
	public static int min(int[] num1) {
		
		int minvalue= num1[0];
		for(int i=1; i<num1.length;i++) {
			if (num1[i]<minvalue) {
				minvalue=num1[i];
			}
		}
		return minvalue;
	}
	public static int max(int[] num2) {
		int maxvalue= num2[0];
		for(int i=1; i<num2.length;i++) {
			if (num2[i]>maxvalue) {
				maxvalue=num2[i];
			}
		}
		return maxvalue;
		
	}
	public static int avg(int[] num3) {
		
		int total=0;
		int average = num3[0];
		for(int i=0;i<num3.length;i++)
		{
			total=total+num3[i];
		}
	average= total/num3.length;
	return average;
    }
}
