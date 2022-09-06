import graphic.Shape;

class Printer {
    public void callName(Shape shape) {
        System.out.println("This class is ["
                + shape.getClass().getName()
                + "] and is called ["
                + shape.getName() + "]");
    }
}
