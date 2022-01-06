package CurrencyConversion;

public class Currency
{
	public float DollarToInr(float Dollar)
	{
		float INR;
		INR = Dollar/74; 
		
		return INR;
	}

	public float EuroToInr(float Euro)
	{
		float INR;
		INR = Euro/100; 
		
		return INR;
	}
	public float YenToInr(float Yen)
	{
		float INR;
		INR = Yen/50; 
		
		return INR;
	}
}