package oop;

public class BankAccount {
	private String accountname;
	int accountnum;
	String ssn;
	String accountStatus;
	String accountType;
	BankAccount()
	{
		System.out.println("New Account Created" +accountname);
	}
	BankAccount(int accountnum)
	{
		System.out.println("Your account number is " + accountnum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String toString()
	{
		return "["+ accountname+ " Number: "+ accountnum + " SSN: " + ssn +" ]";
	}
	public void setName(String accountname)
	{
		this.accountname = accountname;
	}
	public String getName()
	{
		return accountname;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	

}
