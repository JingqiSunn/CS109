import java.util.Random;

public class Circle {
    private double radius;
    private double x;
    private double y;


    private int id = 0;

    public Circle() {
    }

    public Circle(double radius, double x, double y) {
        this.id ++;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void position() {
        System.out.printf("Position of the circle is (%.1f,%.1f)\n", x, y);
    }

    public double getRadius() {
        return radius;
    }

    /*
    Input: Radius of the Circle
    Computation: reset the radius of the circle
    Output: Null
    */
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    hfeuhgiorgfhowrihueairgrhwr



    public String toString() {
        return String.format("radius = %.2f, x = %.2f, y = %.2f", radius, x, y);
    }

}
