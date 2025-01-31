package lv.rvt;

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, String adres, int salary){
        super(name, adres);
        this.salary = salary;

        
    }
    public String toString(){
        return super.toString() + "\n   " + "salary " + salary + " euro/month";
    }
}
