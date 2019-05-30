package oop;

public class ConstructorsBankApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount();
		BankAccount accno = new BankAccount();
		acc1.accountnum=45864;
		acc1.setName("Bala");
		acc1.ssn = "12232323";
		System.out.println(acc1.toString());
		
	}

}
