package basic;

public class Salarycalculator {
	public static void main(String[] args) {
	
		System.out.println("Salary Calculator");
		int workinghour =40;
		int noofweeks = 50;
		double rateperhour = 20;
		double salary = workinghour*noofweeks*rateperhour;
		System.out.println(salary);
	}

}
