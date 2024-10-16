package lv.rvt;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
    
        String name = "";
        while(true){
            name = scanner.nextLine();
            names.add(name);
            if(name == ""){
                break;
            }

            

        }
        System.out.println(names.get(2));

    }
}
