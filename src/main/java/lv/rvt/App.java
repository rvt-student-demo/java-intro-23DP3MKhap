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

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String grupa = scanner.nextLine();

        System.out.println("Students: " + name + " " + surname + ", " + "grupa: " + grupa);



    }

}
