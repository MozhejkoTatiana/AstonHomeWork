package lesson_4;

public class Circle implements Shape, Fillable, Borderable {
    private double radius;
    private String fillColor;
    private String borderColor;


    public Circle(double radius) {
        this.radius = radius;
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
        return perimeterOfCircle(radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printCharacteristics() {
        System.out.println("Круг:");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона : " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
}
