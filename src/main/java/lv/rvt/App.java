package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // // Make your first Hello World app!
        // String text = "contains text";
        // int wholeNumber = 123;
        // double floatingPoint = 3.141592653;
        // boolean trueOrFalse = true;

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Text variable: " + text);
        // System.out.println("Integer variable: " + wholeNumber);
        // System.out.println("Floating-point variable: " + floatingPoint);
        // System.out.println("Boolean: " + trueOrFalse); 



        // System.out.println("Write text and press enter ");
        // String text = scanner.nextLine();
        // System.out.println("You wrote " + text);


        // int value = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());

        int plus = x+y;
        int minuss = x-y;
        int divide = x*y;
        double del = (double) x/y;

        System.out.println(x + " + " + y + " = " + plus);
        System.out.println(x + " - " + y + " = " + minuss);
        System.out.println(x + " * " + y + " = " + divide);
        System.out.println(x + " / " + y + " = " + del);



        


    }}