package seminar3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsTasks {
    public static void main(String[] args) {
        String text = "repeated repeated unique1 unique2";
        System.out.println(uniqueWords(text));

        // Вызвать для text и вывести результат замены на экран
        List<String> textList = new ArrayList<>(List.of(text.split(" ")));
        replaceElements(textList);
        System.out.println(textList);
    }

    /**
     *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
     *  (1 балл)
     */
    public static void replaceElements(List<String> list) {
        List<String> repeated = list.stream()
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .toList();
        for (int i = 0; i < repeated.size(); i++) {
            while (list.contains(repeated.get(i))) {
                list.set(list.indexOf(repeated.get(i)), "blahblah");
            }
        }
    }


    /**
     *  Задание 2: Вернуть количество уникальных слов в строке.
     *  Слова в строке обязательно разделяются пробелом.
     *  (1 балл)
     */
    public static int uniqueWords(String text) {
        List<String> unique = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() == 1)
                .map(Map.Entry::getKey)
                .toList();
        return unique.size();
    }
}
