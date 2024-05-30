package lesson_4;

public class Triangle implements Shape, Fillable, Borderable {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public double calculatePerimeter() {
        return perimeterOfTriangle(side1, side2, side3);
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    public void printCharacteristics() {
        System.out.println("Треугольник:");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);

    }
}
