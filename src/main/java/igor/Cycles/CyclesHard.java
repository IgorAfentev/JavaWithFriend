/*Задание:
    Напишите программу, которая запрашивает число N и выводит
    таблицу умножения для чисел от 1 до N.
 */

//Моё решение
package igor.Cycles;
import java.util.Scanner;

public class CyclesHard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы умножения: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }

        scanner.close();
    }
}

//Решение ChatGPT
class CyclesHardChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы умножения: ");
        while (!scanner.hasNextInt()) { // Проверка на ввод числа
            System.out.println("Ошибка! Введите целое положительное число.");
            scanner.next(); // Очищаем неверный ввод
        }
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Число должно быть больше 0.");
        } else {
            System.out.println("\nТаблица умножения от 1 до " + number + ":\n");
            for (int i = 1; i <= 10; i++) { // Меняем порядок циклов для более читаемого вывода
                for (int j = 1; j <= number; j++) {
                    System.out.printf("%2d * %2d = %-4d\t", j, i, j * i);
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}

/*
🔹 Возможные улучшения:
✅ while (!scanner.hasNextInt()) — программа не сломается, если пользователь введет текст вместо числа
✅ Внешний цикл теперь проходит по i (множителю), а внутренний по j (множимому), что делает таблицу компактнее
✅ Можно сделать более компактный формат с \t (табуляцией), чтобы таблица выглядела аккуратнее
 */
