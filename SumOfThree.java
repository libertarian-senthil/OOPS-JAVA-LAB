
import java.util.Scanner;

public class SumOfThree {
    int n1,n2,n3,result;

    public static void main(String args[]){
        SumOfThree obj = new SumOfThree();
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        obj.n1= input.nextInt();
        System.out.println("Enter second number: ");
        obj.n2= input.nextInt();
        System.out.println("Enter third number: ");
        obj.n3= input.nextInt();
        input.close();
        obj.result = obj.n1+obj.n2+obj.n3;
        System.out.println("The sum of three numbers is: "+obj.result);
    }
}
