/* Задание:
    Напишите метод, который принимает число и возвращает его квадрат
 */

//Моё решение
package igor.MethodsParameters;
import java.util.Scanner;

public class MethodsParametersEasyIgor {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            int number = getNumber(scanner);
            System.out.println(number + " в квадрате равно " + numberSquared(number));
        }
    }

    private static int getNumber(Scanner scanner) {
        System.out.print("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static int numberSquared(int number) {
        return number * number;
    }
}

//Решение ChatGPT
class MethodsParametersEasyIgorChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = getNumber(scanner);
            System.out.println(number + " в квадрате равно " + numberSquared(number));
        }
    }

    // Читаем число с проверкой ввода
    private static int getNumber(Scanner scanner) {
        System.out.print("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next(); // Пропускаем некорректный ввод
        }
        return scanner.nextInt();
    }

    // Метод возведения в квадрат
    static int numberSquared(int number) {
        return number * number; // Можно заменить на (int) Math.pow(number, 2)
    }
}

/*
🔹 Возможные улучшения:
✅ Альтернативный вариант → если хотите, можно использовать Math.pow(number, 2)
 */
