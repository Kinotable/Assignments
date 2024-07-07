import static java.lang.Math.*;
import java.util.Scanner;

class Circle {
    int r;
    double pie = 3.14;
    double area;
    double perimeter;

    public Circle(int r) {
        this.r = r;
        this.area = pie * r * r;
        this.perimeter = 2 * pie * r;
    }
}

class Rectangle {
    float l;
    float b;
    float area;
    float perimeter;

    public Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
        this.area = l * b;
        this.perimeter = 2 * (l + b);
    }
}

class Triangle {
    float sideA;
    float sideB;
    float sideC;
    float perimeter;
    float s;
    double area;

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = sideA + sideB + sideC;
        this.s = perimeter / 2;
        this.area = sqrt(s * ((s - sideA) * (s - sideB) * (s - sideC)));
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("To calculate the area of circle, rectangle or triangle. Enter value 1, 2 or 3 respectively: ");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.println("You chose to find the area and perimeter of circle");
            System.out.println("Enter the radius: ");
            int r = s.nextInt();
            Circle circle = new Circle(r);
            System.out.println("Area: " + circle.area);
            System.out.println("Perimeter: " + circle.perimeter);
        } else if (choice == 2) {
            System.out.println("You chose to find the area and perimeter of rectangle");
            System.out.println("Enter the length: ");
            float l = s.nextFloat();
            System.out.println("Enter the breadth: ");
            float b = s.nextFloat();
            Rectangle rectangle = new Rectangle(l, b);
            System.out.println("Area: " + rectangle.area);
            System.out.println("Perimeter: " + rectangle.perimeter);
        } else if (choice == 3) {
            System.out.println("You chose to find the area and perimeter of triangle");
            System.out.println("Enter side A: ");
            float sideA = s.nextFloat();
            System.out.println("Enter side B: ");
            float sideB = s.nextFloat();
            System.out.println("Enter side C: ");
            float sideC = s.nextFloat();
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            System.out.println("Area: " + triangle.area);
            System.out.println("Perimeter: " + triangle.perimeter);
        } else {
            System.out.println("Try again");
        }
    }
}