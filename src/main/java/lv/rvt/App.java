package lv.rvt;

import java.util.Scanner;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> skaitlis = new ArrayList<>();
        int summ = 0;
        int sk = 0;
        while(true){
            sk = scanner.nextInt();
            skaitlis.add(sk);
            summ += sk;
            if(sk == 0){
                break;
            }
        }
        System.out.println(summ);

    }
}
