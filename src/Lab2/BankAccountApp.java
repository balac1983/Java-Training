package Lab2;

public class BankAccountApp {
	public static void main(String[] args)
	{
		BankAccount acc1 = new BankAccount("4452521234", 5000.00);
		BankAccount acc2 = new BankAccount("4452521234", 400.40);
		BankAccount acc3 = new BankAccount("4452521234", 8000.22);
		BankAccount acc4 = new BankAccount("4452521234", 200.24);
		acc1.makeDeposit(100);
		acc1.accru();
		acc1.setName("Bala");
		System.out.println(acc1.getName());
		/*acc2.setName("Selva");
		acc3.setName("Ashwin");
		acc4.setName("Vishva");
		System.out.println(acc2.getName());
		System.out.println(acc3.getName());
		System.out.println(acc4.getName());*/
		System.out.println(acc1.toString());
		
	}
}
 class BankAccount implements IInterest
 {
	 //properties of bank account for user
	 //Here we need to use encapsulation (private value) client can not have access
	 // ID is static because is not belongs to a person, it's belongs to a class
	 private static int ID = 1000; //internal ID 
	 private String accname; // ID + random2 digit number + first of 2 of ssn
	 private String accnumber;
	 private static final String routingname = "457689241"; // if add final we can't change the value
	 private String ssn;
	 private double balance;
	 	
  //Constructor
 public BankAccount(String ssn, double initdepo)
 {
	 //System.out.println("Account Created Successfully");
	balance = initdepo;
	 this.ssn=ssn;
	 ID++;
	 setAccountNumber();
 }	
 //Encapsulation
 private void setAccountNumber()
 {
	 int random = (int) (Math.random()*100); // for generate random 2 digit number (Note 100 is for 2 digit number)
	 accnumber = ID + "" + random +""+ssn.substring(0,2);
	 System.out.println("Your Account Number is " + accnumber);
 }
 public void setName(String accname)
 {
	 this.accname =accname;
	 
 }
 public String getName()
 {
	 return accname;
 }
 public void makeDeposit(double amount)
 { 
	System.out.println("You Deposited "+ amount); 
    balance = balance + amount;	
    showBalance();
 }
 public void widhDraw(double amount)
 {
	 System.out.println("You widhdraw: "+amount);
	 balance = balance - amount;
	 showBalance();
 }
 public void payBill(double amount)
 {
	 System.out.println("You have paid $" + amount);
	 balance = balance - amount;
	 showBalance();
 }
 public void showBalance()
 {
	 System.out.println("Your Current balanmce is $"+ balance);
 }
@Override
public void accru() {
	balance = balance *rate;
	System.out.println("Your Balance is with interest " + balance);
	
}
 public String toString()
 {
	 return "[ Name: " + accname + "\n Account Number: " + accnumber + "\nYour balace: "+ balance + "]";
 }
}