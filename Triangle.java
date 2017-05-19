public class Triangle extends Shape {
    private final double a, b, c; // sides

    public Triangle(double a, double b, double c) {  //passing value from Testshape class
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Override
    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perameter of the triangle 
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));   // perameter of the triangle 
    }

    //Override
    public double perameter() {
        // P = a + b + c
        return a + b + c;  //area of triangle
    }
}
