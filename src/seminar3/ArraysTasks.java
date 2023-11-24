package seminar3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ArraysTasks {

    public static void main(String[] args) throws Exception {
        Integer[] array = makeArray();
        sortArrayDesc(array);
    }

    /**
     Задание 1: Сформировать целочисленный массив A из N элементов
     при помощи ввода значений с клавиатуры (N вводит пользователь).
     Вывести массив на экран. (1 балл)
     */
    static Integer[] makeArray() throws Exception {
        System.out.println("Ведите n - количество элементов массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("incorrect size");
            return null;
        }
        if (n < 0) {
            System.out.println("incorrect size");
            return null;
        }
        System.out.println("Введите n элементов (каждый с новой строки):");
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            try {
                result[i] = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException e) {
                result[i] = 0;
            }
        }
        return result;
    }

    /**
     Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
     Использовать встроенные функции. (0.5 балла)
     */
    static void sortArrayDesc(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Отсортированный по убыванию массив:");
        Arrays.stream(arr).forEach(System.out::println);
    }
}
