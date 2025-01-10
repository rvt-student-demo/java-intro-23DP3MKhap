package lv.rvt;

import java.util.Scanner;


import java.util.ArrayList;




public class App 
{




    public static void main( String[] args )

    {
        Box box = new  Box( 2.5, 5.0, 6.0 ) ;

        System.out.println("Box width: " + box.width() + " Box height: " + box.height() + " Box length: " + box.length());

        Box largerbox = box.biggerBox(box);
        System.out.println("larger width: " + largerbox.width() + " larger height: " + largerbox.height() + " larger length: " + largerbox.length());
        
        Box smallerbox = box.biggerBox(box);
        System.out.println("smaller width: " + smallerbox.width() + " smaller height: " + smallerbox.height() + " smaller length: " + smallerbox.length());
        
        System.out.println(largerbox.nests(smallerbox));
        System.out.println(box.nests(largerbox));
        }
}