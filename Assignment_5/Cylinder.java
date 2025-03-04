
import java.util.Scanner;

class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder() {
        super("Cylinder");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Cylinder: ");
        this.radius = sc.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        this.height = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Surface Area of Cylinder: " + (2 * Math.PI * radius * (radius + height)));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume of Cylinder: " + (Math.PI * radius * radius * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Cylinder Base: " + (2 * Math.PI * radius));
    }
}

