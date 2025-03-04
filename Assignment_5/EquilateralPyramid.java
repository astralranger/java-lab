
import java.util.Scanner;

class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    public EquilateralPyramid() {
        super("Equilateral Pyramid");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length of Pyramid: ");
        this.base = sc.nextDouble();
        System.out.print("Enter height of Pyramid: ");
        this.height = sc.nextDouble();
    }

    @Override
    void calculateArea() {
        double baseArea = base * base;
        double lateralArea = 2 * base * Math.sqrt((base / 2) * (base / 2) + height * height);
        System.out.println("Surface Area of Pyramid: " + (baseArea + lateralArea));
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume of Pyramid: " + ((1.0 / 3) * base * base * height));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Pyramid Base: " + (4 * base));
    }
}

