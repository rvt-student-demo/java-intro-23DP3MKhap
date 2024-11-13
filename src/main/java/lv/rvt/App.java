package lv.rvt;

import java.util.Scanner;

import lv.rvt.DecreasingCounter;

import java.util.ArrayList;

import java.util.Random;



public class App 
{




    public static void main( String[] args )

    {
        PaymentCard paulcard = new PaymentCard(20);
        PaymentCard mattcard = new PaymentCard(30);
        
        paulcard.eatHeartily();
        mattcard.eatAffordably();
    
        System.out.println("Paul: The card has a balance of " + paulcard);
        System.out.println("Matt: The card has a balance of " + mattcard);

        paulcard.addMoney(20.0);
        mattcard.eatHeartily();
    
        System.out.println("Paul: The card has a balance of " + paulcard);
        System.out.println("Matt: The card has a balance of " + mattcard);

        paulcard.eatAffordably();
        paulcard.eatAffordably();

        mattcard.addMoney(50.0);
    
        System.out.println("Paul: The card has a balance of " + paulcard);
        System.out.println("Matt: The card has a balance of " + mattcard);
    }


    }
