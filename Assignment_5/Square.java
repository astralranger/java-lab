class Square extends Shape {
    double side;
    public Square(double side) {
        super("Square");
        this.side = side;
    }
    @Override
    void calculateArea() {
        System.out.println("Area: " + (side * side));
    }
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (4 * side));
    }
}
