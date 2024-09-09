public class circlefunction {
    // Private variables
    private double x, y;  
    private double r;     

    // Constructor 1: Default constructor (Circle at origin with radius 1)
    public circlefunction() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    // Constructor 2: Circle with a given radius, centered at the origin
    public circlefunction(double r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }

    // Constructor 3: Circle with a given center and radius
    public circlefunction(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // Method to calculate and return the area of the circle
    public double area() {
        return Math.PI * r * r;  // Area = πr^2
    }

    // Method to calculate and return the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * r;  // Circumference = 2πr
    }

    // Method to calculate and return the diameter of the circle
    public double diameter() {
        return 2 * r;  // Diameter = 2r
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public static void main(String[] args) {
        // Create a circle with default constructor
        circlefunction circle1 = new circlefunction();
        System.out.println("Circle 1:");
        System.out.println("Area: " + circle1.area());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Diameter: " + circle1.diameter());

        // Create a circle with radius only
        circlefunction circle2 = new circlefunction(5);
        System.out.println("\nCircle 2:");
        System.out.println("Area: " + circle2.area());
        System.out.println("Circumference: " + circle2.circumference());
        System.out.println("Diameter: " + circle2.diameter());

        // Create a circle with center and radius
        circlefunction circle3 = new circlefunction(2, 3, 7);
        System.out.println("\nCircle 3:");
        System.out.println("Area: " + circle3.area());
        System.out.println("Circumference: " + circle3.circumference());
        System.out.println("Diameter: " + circle3.diameter());
    }
}
