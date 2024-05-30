package lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite) {
        if (appetite <= food) {
            food -= appetite;
            System.out.println("Кот поел и в тарелке осталось " + food + " еды.");
        } else {
            System.out.println("В тарелке недосточно еды для кота.");

        }
    }

    public void setFood(int food) {
        this.food = food;
        System.out.println("В тарелке стало " + food + " еды");
    }
}