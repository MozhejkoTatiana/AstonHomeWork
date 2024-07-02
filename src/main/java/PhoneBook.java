import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers == null) {
            numbers = new ArrayList<>();
            phoneBook.put(surname, numbers);
        }
        numbers.add(phoneNumber);
    }

    public List<String> get(String surname) {
        List<String> numbers = phoneBook.get(surname);
        return numbers != null ? numbers : new ArrayList<>();
    }
}

