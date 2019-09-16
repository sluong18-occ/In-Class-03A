package ic03a.question1;

public class IDCard extends Card
{
	private String idNumber;
	public IDCard(String n, String id)
	{
		super(n);
		id Number = id;
	}
	
	public String format()
	{
		return super.format() + "card holder: " + name + "ID Number: " + idNumber;
	}
}
