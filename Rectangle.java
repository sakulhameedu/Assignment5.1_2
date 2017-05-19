public class Rectangle extends Shape {
    private final double width, length; //sides


    public Rectangle(double width, double length) {  //passing value from Testshape class
        this.width = width;
        this.length = length;
    }

    //Override
    public double area() {
        // A = w * l
        return width * length;   //return area
    }

    //Override
    public double perameter() {   // P = 2(w + l)
       
        return 2 * (width + length); //return perameter
    }

}
