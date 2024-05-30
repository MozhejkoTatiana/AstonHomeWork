package lesson_4;

public class Main {
    public static void main(String[] args) {
        //Задание 1.
        Dog dog = new Dog();
        dog.run(400);
        dog.swim(2);

        Cat cat = new Cat("Уася", 10);
        cat.run(30);
        cat.swim(10);


        Plate plate = new Plate(10);
        Cat cat2 = new Cat("Мурзик", 15);
        cat2.eat(plate, cat2.appetite);
        cat2.catInfo();
        plate.setFood(100);


        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Мурзик", 10);
        catsArray[1] = new Cat("Васька", 20);
        catsArray[2] = new Cat("Барсик", 90);
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(plate, catsArray[i].appetite);
            catsArray[i].catInfo();

        }
        System.out.println("Создано котов - "+ Cat.totalCats);
        System.out.println("Создано собак - "+ Dog.totalDogs);
        System.out.println("Создано животных - "+ Animal.totalAnimals);

        //Задание 2.
        Circle circle = new Circle(4);
        circle.setFillColor("Желтый");
        circle.setBorderColor("Красный");
        circle.printCharacteristics();


        Rectangle rectangle = new Rectangle(10, 25);
        rectangle.setFillColor("Синий");
        rectangle.setBorderColor("Оранжевый");
        rectangle.printCharacteristics();


        Triangle triangle = new Triangle(5, 5, 5);
        triangle.setFillColor("Фиолетовый");
        triangle.setBorderColor("Зеленый");
        triangle.printCharacteristics();
    }
}