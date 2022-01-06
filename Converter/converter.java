//Importing user defined packages.
import TimeConversion.Time;
import CurrencyConversion.Currency;
import DistanceConversion.Distance;

// Importing In-Built packages
import java.util.Scanner;

public class converter
{
	public static void main(String args[])
	{
		char ChoiceMain,Choice2, Dollar, Euro, Yen, INR;
		int amt,value1;
		float value2;
		double value3;
		
		// Creating objects for each package.
		Time time= new Time();
		Distance distance= new Distance();
		Currency currency= new Currency();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Converter application\n"+"choose the conversion:\n"+"1.Currency conversion\n2.Time conversion\n3.Distance conversion");
		ChoiceMain = input.next().charAt(0);
		
		switch(ChoiceMain)
		{
			case '1':	// CurrencyConversion
			{
				System .out.println("Choose a conversion:\n1.Dollor to INR\n2.Yen To INR\n3.Euro To INR");
				Choice2= input.next().charAt(0);
				switch(Choice2)
				{
					case '1':	// DollarToInr
					{
						System.out.println("Enter the Dollars:");
						amt =input.nextInt();
						System.out.println("The INR is: "+currency.DollarToInr(amt));
						break;
					} // case 1
					case '2':	//YenToInr
					{
						System.out.println("Enter the Yen:");
						amt =input.nextInt();
						System.out.println("The INR is: "+currency.YenToInr(amt));
						break;						
					} //case 2
					case '3':	//EuroToInr
					{
						System.out.println("Enter the Euros:");
						amt =input.nextInt();
						System.out.println("The INR is: "+currency.EuroToInr(amt));
						break;
					} //case 3
					
				} //switch 2
				break;
			} // case 1
			
			case '2':	//TimeConversion
			{
				System.out.println("choose an option:\n1.Hrs to Min\n2.Min to hrs\n3.hrs to seconds\n4.seconds to hrs: ");
				value1 =input.nextInt();
				System.out.println("Enter the time value to be converted:");
				value2 = input.nextFloat();
				if (value1 == 1)
					System.out.println("The hrs to min conversion is: "+time.conversion(value2,value1));
				else if (value1 == 2)
					System.out.println("The min to hrs conversion is: "+time.conversion(value2,value1));
				else if (value1 == 3)
					System.out.println("The hrs to seconds conversion is: "+time.conversion(value2,value1));
				else if (value1 == 4)
					System.out.println("The seconds to hrs conversion is: "+time.conversion(value2,value1));
				break;
			} //case 2
			
			case '3':
			{
				System .out.println("Choose a conversion:\n1.meter to km\n2.miles to km\n3.km to miles\n4.km to meter");
				Choice2= input.next().charAt(0);
				switch(Choice2)
				{
					case '1':	// meter to km
					{
						System.out.println("Enter the meter:");
						value3 =input.nextDouble();
						System.out.println("The km is: "+distance.MeterToKilo(value3));
						break;
					} // case 1
					case '2':	// Miles to km
					{
						System.out.println("Enter the miles:");
						value3 =input.nextDouble();
						System.out.println("The Miles is: "+distance.MilesToKilo(value3));
						break;						
					} //case 2
					case '3':	// km to miles
					{
						System.out.println("Enter the km:");
						value3 =input.nextDouble();
						System.out.println("The miles is: "+distance.KiloToMiles(value3));
						break;
					} //case 3
					case '4':	// km to meter
					{
						System.out.println("Enter the km:");
						value3 =input.nextDouble();
						System.out.println("The meter is: "+distance.KiloToMeter(value3));
						break;
					} //case 3
					
				} //switch 2
				break;
			} //case 3
		} // Switch 1
		
		//test snippet
		/*
		System.out.println(ChoiceMain);
		System.out.println(currency.DollarToInr(43));
		System.out.println(distance.KiloToMeter(1));
		System.out.println(time.conversion(1,1));
		// end of test snippet
		*/
	}// main method
}// main class