package lv.rvt;

import java.util.Scanner;

import java.io.BufferedReader;

import java.util.ArrayList;

import java.io.BufferedWriter;



public class App    
{
    




    public static void main( String[] args ) throws Exception{
        Person newPerson = new Person("Lebedev", "Malinovka", 43);

        PersonManager.addPerson(newPerson);

        
}}