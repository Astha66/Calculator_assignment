package com;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args)
    {
        int num1,num2,choice;

        Scanner sc=new Scanner(System.in);
        while(true) {

            System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for division and 5 to exit");
            choice=sc.nextInt();

            switch (choice)
        {
            case 1:
                System.out.println("Enter the first number");
                num1=sc.nextInt();
                System.out.println("Enter the second number");
                num2=sc.nextInt();
                System.out.println("Addition: "+(num1+num2));break;
            case 2:
                System.out.println("Enter the first number");
                num1=sc.nextInt();
                System.out.println("Enter the second number");
                num2=sc.nextInt();
                System.out.println("Difference: "+(num1-num2));break;
            case 3:
                System.out.println("Enter the first number");
                num1=sc.nextInt();
                System.out.println("Enter the second number");
                num2=sc.nextInt();
                System.out.println("Product: "+(num1*num2));break;
            case 4:
                System.out.println("Enter the first number");
                num1=sc.nextInt();
                System.out.println("Enter the second number");
                num2=sc.nextInt();
                System.out.println("Division: "+(num1/num2));break;
            case 5:
                System.out.println("Bye!");
                System.exit(0);break;
            default:System.out.println("Enter a valid choice");
        }

        }


    }
}
