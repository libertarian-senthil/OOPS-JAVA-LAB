package Practicals.Experiments;

import java.util.*;

class Ebill {

    public static void main(String args[]){
        CustomerData data = new CustomerData();
        data.getData();
        data.Calc();
        data.Display();
    }
    
}

class CustomerData{
    
    int bn; 
    Double current,prev,units,tbill;
    String cname,type;

    public void getData() {
        Scanner ins = new Scanner(System.in);

        Scanner str = new Scanner(System.in);


        System.out.println("\nEnter the customer name: ");
        cname = ins.nextLine();
        System.out.println("\nEnter the customer number: ");
        bn = ins.nextInt();
        System.out.println("\nEnter the customer Connection type(D for domestic and E for external): ");
        type = str.nextLine();
        System.out.println("\nEnter the customer Current month reading: ");
        current = ins.nextDouble();
        System.out.println("\nEnter the customer Previous month reading: ");
        prev = ins.nextDouble();

        // Scanner objects must be closed once they have been used or initiated.
        // refer: https://stackoverflow.com/questions/43120687/resource-leak-sc-is-never-closed
        ins.close();
        str.close();       
    }

    public void Calc() {
        units = current - prev;
        if (type.equals("D"))
        {
            if(units<=100){
                tbill = units*1;
            }
            else if(units>100 && units<=200){
                tbill = units*2.50;
            }
            else if(units>200 && units<=500){
                tbill = units*4;
            }
            else if(units>500){
                tbill = units*6;
            }
        }
        else{
            if(units<=100){
                tbill = units*2;
            }
            else if(units>100 && units<=200){
                tbill = units*4.50;
            }
            else if(units>200 && units<=500){
                tbill = units*6;
            }
            else if(units>500){
                tbill = units*7;
            }            
        }
    }

    public void Display() {
        System.out.println("\nCustomer name: "+cname);
        System.out.println("\nCustomer number: "+bn);
        System.out.println("\nCustomer Connection type: "+type);
        System.out.println("\nCustomer this month reading: "+current);
        System.out.println("\nCustomer previous month reading: "+prev);
        System.out.println("\nCustomer consumed: "+units);
        System.out.println("\nCustomer amount to be paid: "+tbill);
    }
} 
