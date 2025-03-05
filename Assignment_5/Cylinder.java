// Cylinder.java
class Cylinder extends Shape implements Volume {
    double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Surface Area: " + (2 * Math.PI * radius * (radius + height)));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + (Math.PI * radius * radius * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("a cylinder does not have a perimeter.");
    }
}
