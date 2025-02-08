package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){

        super(productName, capacity);
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }

    public String history(){
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(amount);
    }

    @Override
    public void takeFromWarehouse(double amount){
        super.takeFromWarehouse(amount);
        history.add(getBalance());
    }

    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
