package lesson_3;

public class Main {
    public static void main(String[] args) {
        //Задание 1.
        Person person1 = new Person("Иванов", "Иван", "Иванович", "Инженер-автоматизатор ПО",
                "ivanov123@mail.ru", 331234567l, 50000, 35);
        person1.info();
        //Задание 2.
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Петров", "Петр", "Петрович", "Инженер", "petrov@mail.ru", 296548975l, 60000, 36);
        persArray[1] = new Person("Михайлов", "Михаил", "Михайлович", "Аналитик", "mihail565@mail.ru", 335689745L, 50000, 40);
        persArray[2] = new Person("Романов", "Роман", "Романович", "Менеджер", "roma78@mail.ru", 296589311L, 400000, 33);
        persArray[3] = new Person("Павлов", "Павел", "Павлович", "Системный аналитик", "pavel11@mail.ru", 338634422L, 50000, 32);
        persArray[4] = new Person("Егоров", "Егор", "Егорович", "Разработчик", "egorgor72@mail.ru", 335685545L, 60000, 41);
        for (int i = 0; i < persArray.length; i++) {
            System.out.println(persArray[i]);
        }
        //Задание 3.
        Park park = new Park("Витебский");
        Park.Attraction attraction = park.new Attraction("Карусель", "10.00-20.00", 20);
        System.out.println(park);

    }

}
