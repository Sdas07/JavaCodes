package OOP;
class Shape{
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
    void area() {
        System.out.println("Generic Shape has no area formula.");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}
public class Shapecal {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(5);              
        s.area(4, 6);           
        s.area(5.0, 3.0);       
        Shape c = new Circle(7);  
        c.area();  
    }    
}
