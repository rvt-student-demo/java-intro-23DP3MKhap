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

        // System.out.println("Give points [0-100]");
        // int x = scanner.nextInt();
        // if (x < 0) {
        //     System.out.println("Impossible");
        // } else if (x <= 49 ){
        //     System.out.println("Failed");
        // } else if (x <= 59 ){
        //     System.out.println("1");
        // } else if (x <= 69 ){
        //     System.out.println("2");
        // } else if (x <= 79 ){
        //     System.out.println("3");
        // } else if (x <= 89 ){
        //     System.out.println("4");
        // } else if (x <= 100 ){
        //     System.out.println("5");
        // } else if (x > 100 ){
        //     System.out.println("Incredible!");
        // }          

        // System.out.println("Gift value?");
        // int gift = scanner.nextInt();
        // if (gift < 5000){
        //     System.out.println("No tax!");
        // } else if (gift >=5000 && gift < 25000){
        //     System.out.println("Tax: " + (100 +(gift-5000)*0.08));
        // } else if (gift >= 25000 && gift <55000){
        //     System.out.println("Tax: " + (1700+(gift-25000)*0.10));
        // } else if (gift >= 55000 && gift < 200000){
        //     System.out.println("Tax: " + (4700+(gift-55000)*0.12));
        // } else if (gift >=200000 && gift < 1000000){
        //     System.out.println("Tax: " + (22100+(gift-200000)*0.15));
        // } else if (gift >= 1000000){
        //     System.out.println("Tax: " + (142100+(gift-1000000)*0.17));
        // }


        // int numsk = 0;
        // int numsum = 0;

        // while (true) {
        //     System.out.println("Give number:");
        //     int number = scanner.nextInt();
        //     if (number != 0){
        //         numsk += 1;
        //         numsum += number;
    
        //     }

        //     else if (number == 0){
        //         System.out.println("Number of numbers: " + numsk);
        //         System.out.println("Sum of the numbers: " + numsum);
        //         break;
        //     }
            

        // }

        // int x = scanner.nextInt();
        // for (int y = 0; y < x+1; y++) {
        //     System.out.println(y);
        // }

        // System.out.println("Last number?");
        // int x = scanner.nextInt();
        // int sum = 0;
        // for (int y = 1; y < x+1; y++ ) {
        // sum += y;
        // }
        // System.out.println(sum);


        // for (int y = 10; y <=100; y += 10) {
        //     System.out.println(y);
        // }

        // int y = 10;
        // while (y <= 100){
        // System.out.println(y);
        // y+=10;
        // }




        // int numb = 0;
        // int sum = 0;
        // int even = 0;
        // int odd = 0;
        // System.out.println("Give numbers:");
        // while (true){
        //     int x = scanner.nextInt();

        //     if (x == -1) {
        //         break;
        //     }
            

        //     if (x%2 == 0){
        //         even += 1;
        //     }

            
        //     if (x%2 != 0){
        //         odd += 1;
        //     }
            
        //     numb++;
        //     sum += x;

            
        // }

        // double avg = (double)sum / numb;
        // System.out.println("Thx! Bye!");
        // System.out.println("Sum: " + sum);
        // System.out.println("Numbers: " + numb);
        // System.out.println("Average: " + avg);
        // System.out.println("Even: " + even);
        // System.out.println("Odd: " + odd);



    // System.out.println("How many times?");
    // int x = scanner.nextInt();
    // for (int y = 0; y < x; y++){
    //     printText();
    // }

    int beginning = scanner.nextInt();
    int end = scanner.nextInt();

    divisibleByThreeInRange(beginning, end);
    }


    // Def tut
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }

    public static void divisibleByThreeInRange(int beginning, int end){

        for (int i = beginning; i <= end; i++){
            if (i%3 == 0){
                System.out.println(i);
            }
        }
        
    }

    }
