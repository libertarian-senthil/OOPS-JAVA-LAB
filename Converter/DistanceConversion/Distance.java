package DistanceConversion;

public class Distance
{
	static double km, Miles;
	static double meter;
	
	public double MeterToKilo(double meter)
	{
		km =meter/1000;
		return km;
	}
	
	public double MilesToKilo(double Miles)
	{
		km =Miles/1.6;
		return km;
	}
	
	public double KiloToMiles(double km)
	{		
		Miles =km*1.6;
		return Miles; 
	}
	
	public double KiloToMeter(double km)
	{
		meter= km*1000;
		return meter;
	}
}