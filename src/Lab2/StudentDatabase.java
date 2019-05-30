package Lab2;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1 =new Student("Bala","457896321", 4000);
        s1.setEmail();
        s1.setUserID();
        s1.enroll();
        s1.setCity("Singapore");
        s1.setPhone("456789");
        s1.setState("Singapore");
        System.out.println(s1.toString());
        s1.pay(2000);
       	}

}

class Student
{
	private static int ID = 1000;
	private String sname;
	private static final String ssn = "456123789";
	String city;
	String phone;
	String state;
	private String email;
	double balance;
	String userId;
	

public Student(String name, String ssn, double iniamount)
{
	this.balance = iniamount;
	//System.out.println("Name: "+ name);
	//System.out.println("SSN: "+ssn);
	this.sname = name;
	ID++;
}

void setEmail()
{
	int random = (int) (Math.random()*100);
	email = sname.toLowerCase() + random + "@" + "abc.com";
	//System.out.println("Email ID:" + email);	
}
void setUserID()
{
	int random = (int) (Math.random()*1000);
	userId = ID +""+ random + ssn.substring(4,9);
	//System.out.println("Your User ID: " + userId);
}

public void enroll()
{
	System.out.println("You are Successfully Entrolled!!");
}
public void pay(double amount)
{
	balance = balance - amount;
	System.out.println(" " + sname + " have paid: $" + amount);
	checkBalance();
	}
public void checkBalance()
{
	System.out.println( " " + sname +" Outstanding Balance : $" + balance);
}
public void setPhone(String ph)
{
	this.phone = ph;
}
public String getPhone()
{
	return phone;
}

public void setCity(String scity)
{
	this.city = scity;
}
public String getCity()
{
	return city;
}
public void setState(String sstate)
{
	this.state = sstate;
}
public String getState()
{
	return state;
}
public String toString()
{
	return "Student Details: \n" + " Student Name: " + sname + "\n Student ID: " + ID + "\n Student UserId: " + userId + "\n Student emial Id: " + email +"\n Phone Number: " +  getPhone() + "\n City: " +  getCity() + "\n State: " +  getState();
}
}
