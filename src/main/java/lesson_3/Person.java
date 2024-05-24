package lesson_3;

//Задание 1.
public class Person {
    private String surname;

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    private String name;
    private String patronymic;
    private String position;
    private String email;
    private long phoneNumber;
    private long salary;
    private int age;

    public Person(String surname, String name, String patronymic, String position, String email, long phoneNumber, long salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public void info() {
        System.out.println("Фамилия: " + surname + "; Имя: " + name + "; Отчество: " + patronymic + "; Должность: " + position +
                "; email: " + email + "; Номер телефона: " + phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}
