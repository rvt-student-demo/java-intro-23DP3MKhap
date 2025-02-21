package lv.rvt;

public class Circle extends GeometricShape {

private double radius; 

public Circle(double radius){
    this.radius = radius;
}


public double getArea() {
    return 3.14*(radius*radius);
}

public double getPerimeter(){
    return 2*3.14*radius;
}

public void displayInfo(){
    System.out.println("Circle Radius = " + radius);
    System.out.println("Circle Area = " + getArea());
    System.out.println("Circle Perimeter = " + getPerimeter());
}
}
