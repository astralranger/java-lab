class Circle extends Shape {
    double radius; // radius of the circle

    public Circle(double radius) {
        super("Circle"); // call parent constructor
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * Math.PI * radius));
    }
}
