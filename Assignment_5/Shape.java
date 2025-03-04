abstract class Shape {
    String shape; // name of the shape

    // constructor to initialize shape name
    public Shape(String shape) {
        this.shape = shape;
    }

    // abstract methods to be implemented by subclasses
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
