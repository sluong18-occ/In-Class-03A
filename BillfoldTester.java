package ic03a.question1;

public class BillFoldTester
{
	public static void main(String[] args)
	{
		DriverLicense d = newDriverLicense("John Doe", 2007);
		CallingCard c = new CallingCard("Omega Card", "0123456789", "1234");
		
		BillFold b = new BillFold();
		
		System.out.println(b.formatCards());
	}
}
