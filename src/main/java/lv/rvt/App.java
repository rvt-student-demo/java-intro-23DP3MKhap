package lv.rvt;

import java.util.Scanner;


import java.util.ArrayList;




public class App 
{




    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        
        String name;
        int year;
        int page;
        String inf;

        while (true){
            System.out.print("Title:");
                name = scanner.nextLine();
                if (name.isEmpty()){
                    break;
                }
                System.out.print("Pages: ");
                year = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Publication year: ");     
                page = scanner.nextInt();
                scanner.nextLine();
                Book book = new Book(name, page, year);
                books.add(book);

            }
        
        System.out.print("What information will be printed?");
        inf = scanner.nextLine();
        if (inf.equals("everything")){
            for (Book book : books){
                System.out.println(book.Fullinfo());
            }
        }
        if (inf.equals("name")){
            for (Book book : books){
                System.out.println(book.Name());
            }
        }










            
    }
}