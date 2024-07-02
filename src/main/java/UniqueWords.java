import java.util.*;

public class UniqueWords {
    public static void Unique(List<String> list) {
        Set<String> uniqueWords = new HashSet<>(list);
        System.out.println("Уникальные слова:");
        uniqueWords.forEach(System.out::println);
    }

    public static void Count(List<String> list) {
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : list) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Количество повторений слова:");
        wordsCount.forEach((word, count) -> System.out.println(word + ":" + count));
    }

}
