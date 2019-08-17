package Question3;

public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 10);
        Shape square = new Square(15);
        Shape circle = new Circle(14);
        rectangle.display(rectangle.calcArea());
        square.display(square.calcArea());
        circle.display(circle.calcArea());

    }
}

class Shape {
    double length, width;

    void display(double a) {
        System.out.println(a);
    }

    double calcArea() {
        return length * width;
    }
}

class Rectangle extends Shape {
    Rectangle(double length, double width) {
        super.length = length;
        this.width = width;
    }
}

class Square extends Shape {
    Square(double length) {
        this.length = length;
    }

    @Override
    double calcArea() {
        return length * length;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return 22 / 7 * radius * radius;
    }
}

