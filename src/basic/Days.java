package basic;

public class Days {
	public static void main(String[] args) {
		String dayofweek = "Wednesday";
		switch (dayofweek) {
		case "Monday": System.out.println("This is Monday");
		break;
		case "Tuesday": System.out.println("This is Tuesday");
		break;
		case ("Wednesday"): System.out.println("This is Wednesday");
		break;
		case "Thursday": System.out.println("This is Thursday");
		break;
		default: System.out.println("This is Friday");
		}
	}

}
