import java.util.Scanner;

class Rectangle {
    double width;
    double height;
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of Rectangle 1: ");
        double w1 = sc.nextDouble();
        System.out.print("Enter height of Rectangle 1: ");
        double h1 = sc.nextDouble();

        System.out.print("Enter width of Rectangle 2: ");
        double w2 = sc.nextDouble();
        System.out.print("Enter height of Rectangle 2: ");
        double h2 = sc.nextDouble();

        Rectangle r1 = new Rectangle(w1, h1);
        Rectangle r2 = new Rectangle(w2, h2);

        System.out.println("\nRectangle 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has larger area");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("\nRectangle 2 has larger area");
        } else {
            System.out.println("\nBoth rectangles have equal area");
        }
    }
}
