package lv.rvt;

public class Warehouse {
private double capacity;
private double balance;
    public Warehouse(double capacity){
        this.capacity = capacity;
        if (this.capacity <=0){
            this.capacity = 0;
        }
    }

    

    public double getCapacity(){
        return capacity;
    }

    public double getBalance(){
        return balance;
    }

    public double howMuchSpaceLeft(){
        return capacity - balance;
    }

    public void addToWarehouse(double amount){
        if (amount > 0) {
            if (amount > capacity) {
                balance = capacity; 
            } else {
                balance = balance + amount;
            }
        }

    }

    public void takeFromWarehouse(double amount){
        if (amount <= 0) {
            amount = 0;
        }
        if (amount > balance) {
            balance = 0;
        }
        else{
        balance = balance - amount;
        }}
    
    
    @Override
    public String toString(){
        return "balance = " + getBalance() + ", " + "space left " + howMuchSpaceLeft();
    }

}
