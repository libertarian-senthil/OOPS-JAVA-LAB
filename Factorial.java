import java.util.Scanner;

public class Factorial 
{
	
    public static void main(String args[])
	{

	int i,num;
	int fact=1;

	Scanner input=new Scanner(System.in);

	System.out.println("Enter a number");
	num= input.nextInt();

		for (i=1;i<=num;i++)
		{
			fact= fact*i;
		}
	
	System.out.println("The factorial of "+num+" is: "+fact);
	}
}