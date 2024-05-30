package lesson_4;

public class Cat extends Animal {
    int appetite; // aппетит кота
    boolean satiety; // поле сытость
    static int totalCats = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.satiety = false; //кот создается голодным
        this.appetite = appetite;
        totalCats++; // подсчет созданных котов
    }


    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал расстояние в " + distance + " метров");
        } else {
            System.out.println("Расстояние слишком велико для забега");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");

    }

    public boolean eat(Plate plate, int appetite) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            return this.satiety = true;
        } else {
            System.out.println("В тарелке недосточно еды для кота.");
            return this.satiety = false;
        }
    }

    public void catInfo() {
        if (!satiety) {
            System.out.println("Котик " + name + " голоден");
        } else {
            System.out.println("Котик " + name + " сыт");
        }

    }


}






