package ic03a.question1;

public class Billfold
{
	private Card card1;
	private Card card2;
	
	public Billfold(Card card1, Card card2)
	{
		super();
		this.card1 = card1;
		this.card2 = card2;
	}
	
	public void addCard(Card c)
	{
	
	}
	public String formatCards()
	{
		return "Billfold [" + card1.format() + "][" card2.format() + "]";
	}
}
