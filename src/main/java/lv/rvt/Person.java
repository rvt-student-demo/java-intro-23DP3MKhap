package lv.rvt;

public class Person {

    private String name;
    private String adres;

    public Person(String name, String adres) {
        this.name = name;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return name + "\n   " + adres;

    }
    
}