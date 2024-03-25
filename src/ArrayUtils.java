import java.util.*;

public class ArrayUtils {
    public static void main(String[] args) {
        printDuplicates();
    }

    public static void printDuplicates() {
        String[] wordsArray = {"announce", "destroy","originate","strip","announce","hesitate","originate","encounter","split",
                "strip","destroy","last","benefit","encounter","main","word"};
        List<String> wordsList = Arrays.asList(wordsArray);
        Set<String> wordsSet = new HashSet<String>(wordsList);
        Map<String, Integer> countDuplicateMap = new HashMap<>();
        for (String word : wordsSet) {
            countDuplicateMap.put(word, Collections.frequency(Arrays.asList(wordsArray), word));
        }
        System.out.println("исходный массив слов:\n" + Arrays.toString(wordsArray));
        System.out.println("список уникальных слов:\n" + wordsSet);
        System.out.println("считаем дубликаты:\n" + countDuplicateMap);
    }
}