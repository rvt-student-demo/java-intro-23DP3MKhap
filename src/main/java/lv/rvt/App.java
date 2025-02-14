package lv.rvt;

import java.util.Scanner;

import java.io.BufferedReader;

import java.util.ArrayList;




public class App    
{
    




    public static void main( String[] args ) throws Exception{
        ArrayList<Person> personList = PersonManager.getPersonList();
        for (Person person : personList){
            System.out.println(person);
        }

        
}}