package lv.rvt;

import java.util.Scanner;

import lv.rvt.DecreasingCounter;

import java.util.ArrayList;

import java.util.Random;



public class App 
{




    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        int evensum = 0;
        int oddsum = 0;
        
        
        System.out.println("Enter numbers:");
        
        
        
        while(true){
            int inp = scanner.nextInt();
            if (inp == -1){
                break;
            }
            if (inp % 2 == 0){
                evensum += inp;
            }
            else{
                oddsum += inp;
            }
            statistics.addNumber(inp);

        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);


    }
}
