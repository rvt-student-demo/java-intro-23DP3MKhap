package lv.rvt;

public class Product {
    private int weight;
    private String location;
    private String name;


    public Product(String initialName, String initialLocation , int initialWeight){
        this.weight = initialWeight;
        this.location = initialLocation;
        this.name = initialName;
}

    public Product(String name){
        this(name, "shelf", 1);
}

public Product(String name, String location){
    this(name, location, 1);
}

public Product(String name, int weight){
    this(name, "shelf", weight);
}

public String toString(){
    return name + " (" + weight + "kg)" + " can be found from the " + location;
}


}