public class Module_8 {
    public static void main(String[] args) {
        Circle circle = new Circle("circle");
        Quad quad = new Quad("square");
        Rect rect = new Rect("rect");
        Triangle triangle = new Triangle("triangle");
        Oval oval = new Oval("oval");
        new Printer().callName(circle, quad, rect, triangle, oval);
    }
}

abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }
}

class Quad extends Shape {
    public Quad(String name) {
        super(name);
    }
}

class Rect extends Shape {
    public Rect(String name) {
        super(name);
    }
}

class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }
}

class Oval extends Shape {
    public Oval(String name) {
        super(name);
    }
}

class Printer {
    public void callName(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println("This class is ["
                    + shape.getClass().getName()
                    + "] and is called ["
                    + shape.getName() + "]");
        }
    }
}

