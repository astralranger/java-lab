class EquilateralPyramid extends Shape implements Volume {
    double baseSide, height;
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }
    @Override
    void calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralArea = 2 * baseSide * slantHeight;
        System.out.println("Surface Area: " + (baseArea + lateralArea));
    }
    @Override
    public void calculateVolume() {
        System.out.println("Volume: " + ((1.0 / 3.0) * (baseSide * baseSide) * height));
    }
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (4 * baseSide));
    }
}
