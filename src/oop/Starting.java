package oop;
import java.util.Scanner;

//Class is Here
class myClass{
	// Attributes
	String name;
	String email;
	String phone;
	
	//Methods 
	void walk() {
		System.out.println(name + " can Walk");
	}
	
	void sleep()
	{
		System.out.println(name + " can sleep");
	
	}
	void eat()
	{
		System.out.println(name + " can eat");
	}
	
}
public class Starting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Objects
		myClass myObject1 = new myClass();
		
		myObject1.name = "Bala";
		myObject1.email = "bala@123";
		myObject1.phone = "12345678";
		
		myClass myObject2 = new myClass();
		myObject2.name = "Selva";
		myObject2.email = "selva@123";
		myObject2.phone = "456789";
		
		myObject1.walk();
		myObject2.sleep();
		myObject1.eat();
		

	}

}
