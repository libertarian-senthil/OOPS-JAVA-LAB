import java.util.Scanner;

public class Fibonacci
{
	static int n;
	
	public int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		Fibonacci op=new Fibonacci();
		System.out.println("Enter a number: ");
		n= input.nextInt();
		System.out.println("The fabonacci number upto the value "+n+" is "+op.fib(n));
	}
}