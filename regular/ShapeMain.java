abstract class Shape {
    public abstract double area() throws InvalidDimensionsException;
    public abstract double perimeter() throws InvalidDimensionsException;
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() throws InvalidDimensionsException {
        if (radius <= 0) {
            throw new InvalidDimensionsException("Invalid radius value");
        }
        return Math.PI * radius * radius;
    }
    public double perimeter() throws InvalidDimensionsException {
        if (radius <= 0) {
            throw new InvalidDimensionsException("Invalid radius value");
        }
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() throws InvalidDimensionsException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionsException("Invalid length or width value");
        }
        return length * width;
    }
    public double perimeter() throws InvalidDimensionsException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionsException("Invalid length or width value");
        }
        return 2 * (length + width);
    }
}
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double area() throws InvalidDimensionsException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new InvalidDimensionsException("Invalid side length value");
        }
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double perimeter() throws InvalidDimensionsException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new InvalidDimensionsException("Invalid side length value");
        }
        return side1 + side2 + side3;
    }
}
class InvalidDimensionsException extends Exception {

    public InvalidDimensionsException(String message) {
        super(message);
    }
}
public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        try {
            System.out.println("Circle area: " + circle.area());
            System.out.println("Circle perimeter: " + circle.perimeter());
        } catch (InvalidDimensionsException e) {
            System.out.println(e.getMessage());
        }
        Shape rectangle = new Rectangle(10, 5);
        try {
            System.out.println("Rectangle area: " + rectangle.area());
            System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        } catch (InvalidDimensionsException e) {
            System.out.println(e.getMessage());
        }
        Shape triangle = new Triangle(3, 4, 5);
        try {
            System.out.println("Triangle area: " + triangle.area());
            System.out.println("Triangle perimeter: " + triangle.perimeter());
        } catch (InvalidDimensionsException e) {
            System.out.println(e.getMessage());
        }
    }
}