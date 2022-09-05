public class Module_8 {
    public static void main(String[] args) {
        Circle circle = new Circle("circle");
        Quad quad = new Quad("square");
        Rect rect = new Rect("rect");
        Triangle triangle = new Triangle("triangle");
        Oval oval = new Oval("oval");
        new Printer().callName(circle);
        new Printer().callName(quad);
        new Printer().callName(rect);
        new Printer().callName(triangle);
        new Printer().callName(oval);
    }
}

class Printer {
    public void callName(Shape shape) {
        System.out.println("This class is ["
                + shape.getClass().getName()
                + "] and is called ["
                + shape.getName() + "]");
    }
}

