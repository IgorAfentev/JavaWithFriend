/*Задание:
    Напишите программу, которая вычисляет среднее арифметическое трех введённых
    пользователем чисел, округляет результат до двух знаков после запятой
 */

//Моё решение
package igor.Variables;
import java.util.Scanner;
import java.util.Locale;

public class VariablesHard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите первое число: ");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float num2 = scanner.nextFloat();
        System.out.println("Введите третье число: ");
        float num3 = scanner.nextFloat();

        System.out.printf("Среднее арифметическое этих чисел: %.2f", (num1 + num2 + num3) / 3);

        scanner.close();
    }

}

//Решение ChatGPT
//import java.util.Scanner;
//import java.util.Locale;

class VariablesHardChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        System.out.printf("Среднее арифметическое этих чисел: %.2f%n", average);

        scanner.close();
    }
}

/*
🔹 Что улучшено?
✅ Заменён float на double для большей точности
✅ Добавлен \n (%n) в printf() для корректного вывода
✅ Добавлена переменная average для лучшей читаемости
 */