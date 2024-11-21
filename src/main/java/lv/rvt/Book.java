package lv.rvt;

public class Book {

    private String title;
    private int pages;
    private int year;

    public Book(String title, int page, int year){
        this.title = title;
        this.pages = page;
        this.year = year;
    }


    public String Fullinfo() {
        return this.title + ", " + this.pages + " pages, Publication year: " + this.year ;
    }

    public String Name(){
        return this.title;
    }

}
