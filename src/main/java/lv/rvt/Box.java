package lv.rvt;

public class Box {

    public double width;    
    public double height;
    public double length;
    public double side;

    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box ( double side ){
        this.side = side;
    }

    Box( Box oldBox ){
        this.length = oldBox.length;
        this.width = oldBox.width;
        this.height = oldBox.height;
        }

        public Box biggerBox( Box oldBox )
    {

    return new Box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }
    
    public Box smallerBox( Box oldBox )
    {

    return new Box(0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }
   

    public Box smallerBox() {
    return new Box(0.75 * width, 0.75 * height, 0.75 * length);
    }


    public boolean nests(Box outsideBox) {
    return width < outsideBox.width && height < outsideBox.height && length < outsideBox.length;
    }

    public double volume(){
        return width*height*length;
    }

    private double faceArea(){
        return height*width;
    }

    private double topArea(){
        return width*length;
    }

    private double sideArea(){
        return height*length;
    }

    public double area(){
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();              
    }

    public double length(){
        return length;
    }
    public double height(){
        return height;
    }
    public double width(){
        return width;
    }


}
