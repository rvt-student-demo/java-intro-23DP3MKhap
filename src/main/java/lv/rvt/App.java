package lv.rvt;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Random;



public class App 
{




    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);

        double gsum = 0;
        int maxl = 0;
        int kl = 0;
        String maxi = ""; 

        while (true){
            String i = scanner.nextLine();
            if (i.equals("")){
                break;
            }
        kl ++;

        String [] ch = i.split(",");
        gsum += Integer.valueOf(ch[1]);
        
        if (maxl < ch[0].length()){
            maxl = ch[0].length();
            maxi = ch[0];
        }


        }

        System.out.println("Longest name: " + maxi);
        System.out.println("Average of the birth years: " + gsum/kl);



    }
}
