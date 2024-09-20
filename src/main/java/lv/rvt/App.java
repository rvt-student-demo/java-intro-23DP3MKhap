package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println("Hello, world!");

        Scanner scanner = new Scanner(System.in);

        // String input = scanner.nextLine();

        // System.out.println(input);

        // System.out.println("Sveiks " + input + "!");

        // String name = "John";
        // int age = 20;
        // boolean isOnline = true;

        // String name = scanner.nextLine();
        // String surname = scanner.nextLine();
        // String grupa = scanner.nextLine();

        // System.out.println("Students: " + name + " " + surname + ", " + "grupa: " + grupa);





        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = a+b;

        // System.out.println(c);

        // System.out.println("Give the first number:");
        // int x = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the second number:");
        // int y = Integer.valueOf(scanner.nextLine());

        // int plus = x+y;
        // int minuss = x-y;
        // int divide = x*y;
        // double del = (double) x/y;

        // System.out.println(x + " + " + y + " = " + plus);
        // System.out.println(x + " - " + y + " = " + minuss);
        // System.out.println(x + " * " + y + " = " + divide);
        // System.out.println(x + " / " + y + " = " + del);

        // System.out.println("Give speed:");
        // int speed = scanner.nextInt();

        // if (speed > 120) {
        //     System.out.println("Speeding ticket!");
        // }


        // int number = scanner.nextInt();

        // if (number == 1) {
        //     System.out.println("The number is one");
        // } else if (number == 2) {
        //     System.out.println("The given number is two");
        // } else if (number == 3) {
        //     System.out.println("The number must be three!");
        // } else {
        //     System.out.println("Something else!");
        // }

        System.out.println("Give points [0-100]");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Impossible");
        } else if (x <= 49 ){
            System.out.println("Failed");
        } else if (x <= 59 ){
            System.out.println("1");
        } else if (x <= 69 ){
            System.out.println("2");
        } else if (x <= 79 ){
            System.out.println("3");
        } else if (x <= 89 ){
            System.out.println("4");
        } else if (x <= 100 ){
            System.out.println("5");
        } else if (x > 100 ){
            System.out.println("Incredible!");
        }          


    }}