package lv.rvt;

import javax.swing.text.html.StyleSheet;

public class Circle extends GeometricShape {

private double radius; 

public Circle(double radius){
    this.radius = radius;
}


public void getArea() {
    System.out.println("Circle Area = " + 3.14*(radius*radius));
}

public void getPerimeter(){
    System.out.println("Circle Perimeter = " + 2*3.14*radius);
}

public void displayInfo(){
    System.out.println("Circle Radius = " + radius);
    System.out.println("Circle Area = " + 3.14*(radius*radius));
    System.out.println("Circle Perimeter = " + 2*3.14*radius);
}
}
