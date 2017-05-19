public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle(double radius) {      //Passing value of radius from Testshape 
        this.radius = radius;
    }

    //Override
    public double area() {
 
        return pi * Math.pow(radius, 2);  //Substituting value of PI as 3.14
    }

    public double perameter() {
      
        return 2 * pi * radius;  //Substituting value of PI as 3.14
    }
}
