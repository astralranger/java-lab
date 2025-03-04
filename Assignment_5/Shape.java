
abstract class Shape {
    // every shape will have a name to identify it
    protected String shapeName;

    // constructor to initialize shape name
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // abstract methods to be implemented by subclasses
    abstract void calculateArea();
    abstract void calculatePerimeter();
    abstract void inputValues();  
}
