package lv.rvt;

import java.util.Scanner;


import java.util.ArrayList;




public class App 
{




    public static void main( String[] args )

    {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();
        
            try {
                Thread.sleep(10);
            } catch (Exception e) {
        
            }
        }

            
    }
}