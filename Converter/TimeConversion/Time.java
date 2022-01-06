package TimeConversion;

public class Time
{
	public float conversion(float value, int option)
	{
		
		switch(option)
		{
			case 1: //Hrs to min
			{
				value= value*60;
				break;
			} // case 1
			case 2: // min to hrs
			{
				value= value/60;
				break;
			}
			case 3: // hrs to seconds
			{
				value= value*3600;
				break;
			}
			case 4: // seconds to hrs
			{
				value= value/3600;
				break;
			}
		} 
		
		return value;
	}  

} 