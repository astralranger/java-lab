class Rectangle extends Shape {
    double length, width; // length and width of rectangle

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}
