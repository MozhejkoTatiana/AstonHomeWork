package lesson_4;

public interface Shape {
    default double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }
    default double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }
    default double perimeterOfTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    double calculateArea();
}
