import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Задание 1.
        List<String> wordsList = Arrays.asList("Витебск", "Гомель", "Полоцк", "Новополоцк", "Минск", "Витебск", "Брест",
                "Гомель", "Гродно", "Полоцк", "Могилев", "Полоцк", "Новополоцк", "Витебск", "Гомель");

        UniqueWords.Unique(wordsList);
        UniqueWords.Count(wordsList);

        //Задание 2.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+375295636989");
        phoneBook.add("Петров", "+375332568956");
        phoneBook.add("Сидоров", "+375332566898");
        phoneBook.add("Иванов", "+375331112245");
        System.out.println("Номера телефона Иванова :" + phoneBook.get("Иванов"));
        System.out.println("Номера телефона Петрова :" + phoneBook.get("Петров"));
        System.out.println("Номера телефона Сидорова :" + phoneBook.get("Сидоров"));


    }
}
