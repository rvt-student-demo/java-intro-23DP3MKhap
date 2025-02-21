package lv.rvt;

public class Person {

    private String name;
    private int age;
    private String adres;

    public Person(String name, String adres, int age) {
        this.name = name;
        this.adres = adres;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdres() {
        return adres;
    }

    @Override
    public String toString() {
        return name + "\n   " + adres;

    }
    
}