/* Задание:
    Напишите метод, который принимает три числа и возвращает их среднее арифметическое
 */

//Моё решение
package igor.MethodsParameters;
import java.util.Scanner;

public class MethodsParametersMediumIgor {

    public static void main(String[] args) {
        try {
            System.out.printf("Среднее арифметическое этих чисел: %.2f", arithmeticMean());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static float arithmeticMean() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int num3 = scanner.nextInt();

        return (float) (num1 + num2 + num3) / 3;

    }
}

//Решение ChatGPT
class MethodsParametersMediumIgorChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Получаем числа с валидацией
            int num1 = getValidNumber(scanner, "Введите первое число: ");
            int num2 = getValidNumber(scanner, "Введите второе число: ");
            int num3 = getValidNumber(scanner, "Введите третье число: ");

            // Вызываем метод и выводим результат
            System.out.printf("Среднее арифметическое: %.2f%n", arithmeticMean(num1, num2, num3));
        }
    }

    // Метод для запроса и проверки числа
    private static int getValidNumber(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next(); // Пропускаем некорректный ввод
        }
        return scanner.nextInt();
    }

    // Метод для вычисления среднего арифметического
    static float arithmeticMean(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0f;
    }
}

/*
🔹 Что было улучшено?:
✅ Метод arithmeticMean() теперь принимает параметры, а не работает со Scanner.
✅ Добавлен getValidNumber() → теперь код не повторяется 3 раза.
✅ Используется try-with-resources в main(), чтобы автоматически закрыть Scanner.
 */


