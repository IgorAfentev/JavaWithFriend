/* Задание:
    Напишите метод, который принимает два числа и возвращает их сумму
 */

//Моё решение
package igor.Methods;
import java.util.Scanner;

public class MethodsMediumIgor {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();

            System.out.println("Сумма чисел равна " + sumOfNumbers(number1, number2));
        }
    }

    static int sumOfNumbers(int number1, int number2) {

        return number1 + number2;
    }
}

//Решение ChatGPT
class MethodsMediumIgorChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number1 = getNumber(scanner, "Введите первое число: ");
            int number2 = getNumber(scanner, "Введите второе число: ");

            System.out.println("Сумма чисел равна " + sumOfNumbers(number1, number2));
        }
    }

    // Метод для получения числа от пользователя
    private static int getNumber(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {  // Проверка на корректный ввод
            System.out.println("Ошибка: Введите целое число!");
            scanner.next();  // Очищаем ввод
            System.out.print(message);
        }
        return scanner.nextInt();
    }

    // Метод для вычисления суммы
    static int sumOfNumbers(int number1, int number2) {
        return number1 + number2;
    }
}

/*
🔹 Возможные улучшения:
✅ Программа не ломается при неверном вводе (например, если ввести "abc" вместо числа).
✅ Ввод чисел теперь в отдельном методе getNumber() → код стал читаемее.
✅ Используется try-with-resources для Scanner → хорошая практика.
 */
