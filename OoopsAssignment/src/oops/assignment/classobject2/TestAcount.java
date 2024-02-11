package oops.assignment.classobject2;

public class TestAcount {

	public static void main(String[] args) {
		Account a=new Account();
		a.aac_no=12545;
		a.name="rahul namekar";
		a.setDetails(12546, "Rahul namekar", 25000);
		a.showWithdraw(500);
		a.showDeposit(1000);
		a.displayaccountInformatin();
		

	}

}
