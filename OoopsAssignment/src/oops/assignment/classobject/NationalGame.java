package oops.assignment.classobject;

public class NationalGame {
	
	String countryname;
	
	public void showResult(String countryname) 
	{
		this.countryname=countryname;
		
		switch(countryname) {
		
		case "India":
			System.out.println("Hocky");
			break;
		case "China":
			System.out.println("Table tanis");
			break;
		case "Bangladesh":
			System.out.println("Kabbadi");
			break;
		case "Italy":
			System.out.println("Football");
			break;
		case "UnitedState":
			System.out.println("Base ball");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
