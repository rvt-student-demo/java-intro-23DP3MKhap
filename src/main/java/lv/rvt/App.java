package lv.rvt;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Random;



public class App 
{




    public static void main( String[] args )

    {
        Account mikhAccount = new Account("Mikhail's account", 100.00);
        
        System.out.println("Initial state");
        System.out.println(mikhAccount);
        
        mikhAccount.deposit(20);
        System.out.println("The balance of Mikhail's account is now: " + mikhAccount.balance());
        
        System.out.println("End state");
        System.out.println(mikhAccount);

    }
}
