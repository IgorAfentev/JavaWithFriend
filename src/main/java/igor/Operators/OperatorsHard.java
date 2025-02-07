/*Задание:
    Напишите программу-калькулятор, которая запрашивает два числа и
    оператор (+, -, *, /), а затем выполняет соответствующую операцию
 */

//Моё решение
package igor.Operators;
import java.util.Scanner;

public class OperatorsHard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите один из операторов \"+, -, *, /\": ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("Сумма чисел: %d%n", num1 + num2);
                break;
            case '-':
                System.out.printf("Разница чисел: %d%n", num1 - num2);
                break;
            case '*':
                System.out.printf("Произведение чисел: %d%n", num1 * num2);
                break;
            case '/':
                System.out.printf("Результат деления чисел: %d%n", num1 / num2);
                break;
        }

        scanner.close();
    }
}

//Решение ChatGPT

//import java.util.Scanner;

class OperatorsHardChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Сумма чисел: %.2f%n", result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Разница чисел: %.2f%n", result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Произведение чисел: %.2f%n", result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: Деление на ноль невозможно!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                    System.out.printf("Результат деления: %.2f%n", result);
                }
                break;
            default:
                System.out.println("Ошибка: Некорректный оператор!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Операция выполнена успешно.");
        }

        scanner.close();
    }
}

/*
🔹 Что улучшено?
✅ Используем double вместо int, чтобы поддерживать дробные числа.
✅ Обработка деления на ноль (if (num2 == 0)).
✅ Оператор default в switch-case, чтобы обработать некорректный ввод.
✅ Форматированный вывод (%.2f), чтобы показывать 2 знака после запятой.
✅ Сообщение о завершении операции, если всё прошло успешно.
 */