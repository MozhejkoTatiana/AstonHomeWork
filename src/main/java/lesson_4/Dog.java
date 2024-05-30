package lesson_4;

public class Dog extends Animal {
    static int totalDogs = 0;

    public Dog() {
        totalDogs++;
    }// Счетчик созданных собак

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала расстояние в " + distance + " метров");
        } else {
            System.out.println("Расстояние слишком велико для забега");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла расстояние в " + distance + " метров");
        } else {
            System.out.println("Расстояние слишком велико для плавания");
        }
    }

}
