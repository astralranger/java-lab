
import java.util.Scanner;

class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere() {
        super("Sphere");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Sphere: ");
        this.radius = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Surface Area of Sphere: " + (4 * Math.PI * radius * radius));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume of Sphere: " + ((4.0 / 3) * Math.PI * radius * radius * radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Sphere has no perimeter.");
    }
}

