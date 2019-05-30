package basic;

public class Numberscalc {
	public static void main(String[] args)
	{
		printMyname();
		int numb1 = 10;
		int numb2 =20;
		numbers(numb1,numb2);
		System.out.println(multiply(numb1,numb2));
	}
	static void printMyname() {
		System.out.println("My name is Bala");
	}
	static void numbers(int x, int y) {
		//int x= 10;
		//int y = 5;
		int z = x+y;
		System.out.println("The Addition is " + z );
	}
	
	static int multiply(int value1, int value2)
	{
		//int x= 10;
		//int y =5;
		int result= value1*value2;
		return result;
	}
}
