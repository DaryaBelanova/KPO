package seminar3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaseTasks {
    public static void main(String[] args) throws Exception {
        try {
            askForInput();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println();

        System.out.println("Корни уравнения: x^2 + x - 6 = 0");
        // x^2 + x - 6 = 0, корни: 3 и -2, вывод: [3, -2]
        System.out.println(Arrays.toString(quadraticRoots(1d, 1d, -6d)));

        System.out.println("Корни уравнения: x^2 + 2x + 5 = 0");
        // x^2 + 2x + 5 = 0, корни: нет, вывод: null
        System.out.println(Arrays.toString(quadraticRoots(1d, 2d, 5d)));
    }

    /**
     Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
     (0.5 балла)
     Формат вывода:
     " Фамилия:
     Имя:
     Отчество:
     "
     */
    static void askForInput() throws Exception {
        System.out.println("Введите ФИО в одну строку через пробел:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] fio = reader.readLine().split(" ");
        if (fio.length != 3) {
            throw new IllegalArgumentException("incorrect data");
        }
        System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s", fio);
    }

    /**
     Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
     */
    // возвращает null, если корней нет, и double[2] - массив из двух элементов (корни)
    static double[] quadraticRoots(double a, double b, double c) {
        double discriminant = b*b - 4 * a * c;
        if (discriminant < 0) {
            return null;
        }
        double sqrtDiscriminant = Math.sqrt(discriminant);
        double x1 = (-b + sqrtDiscriminant) / (2 * a);
        double x2 = (-b - sqrtDiscriminant) / (2 * a);
        return new double[] {x1, x2};
    }
}
