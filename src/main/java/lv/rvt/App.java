package lv.rvt;

import java.util.Scanner;

import lv.rvt.DecreasingCounter;

import java.util.ArrayList;

import java.util.Random;



public class App 
{




    public static void main( String[] args )

    {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();


    }
}