class Sphere extends Shape implements Volume {
    double radius;
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
    @Override
    void calculateArea() {
        System.out.println("Surface Area: " + (4 * Math.PI * radius * radius));
    }
    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
    }
    @Override
    void calculatePerimeter() {
        System.out.println("a sphere does not have a perimeter.");
    }
}
