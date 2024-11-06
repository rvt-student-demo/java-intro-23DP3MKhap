package lv.rvt;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Random;



public class App 
{




    public static void main( String[] args )

    {
        Account mattAccount = new Account("Matthew's account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        System.out.println("Initial state");
        System.out.println(mattAccount);
        System.out.println(myAccount);
        
        mattAccount.withdraw(100);
        System.out.println("The balance of Matthew's account is now: " + mattAccount.balance());

        myAccount.deposit(100);
        System.out.println("The balance of My account is now: " + myAccount.balance());
        
        System.out.println("End state");
        System.out.println(myAccount);
        System.out.println(mattAccount);

    }
}
