package Practicals;

import java.util.Scanner;

public class EvenOrOdd {
    
    int number;
    public static void main(String args[]){

        EvenOrOdd obj = new EvenOrOdd();
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number:");
        obj.number = input.nextInt();
        input.close();
        
        if  (obj.number == 0){
            System.out.println("The given number is neither even nor odd");
        }
        else if (obj.number%2 == 0  ){
            System.out.println("The given number "+obj.number+" is even");
        }
        else{
            System.out.println("The given number "+obj.number+" is odd");
        }
    }
}
