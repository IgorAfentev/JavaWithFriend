package alexey.Operators;

import java.util.Scanner;

public class OperatorsHardChatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите число 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char cha = scanner.next().charAt(0);

        if (cha == '+') {
            System.out.printf("Результат сложения: %d%n", num1 + num2);
        } else if (cha == '-') {
            System.out.printf("Результат вычитания: %d%n", num1 - num2);
        } else if (cha == '*') {
            System.out.printf("Результат умножения: %d%n", num1 * num2);
        } else if (cha == '/') {
            if (num2 == 0) {
                System.out.println("Ошибка: деление на ноль!");
            } else {
                System.out.printf("Результат деления: %d%n", num1 / num2);
            }
        } else {
            System.out.println("Ошибка: неверный оператор!");
        }

        scanner.close();
    }
}

/*
Что исправлено:

✅ Удален = из списка операций.
✅ Добавлена проверка деления на ноль.
✅ Исправлены лишние скобки в if (cha == '+').
✅ Сделан единообразный ввод через print.

Теперь программа работает стабильно и без ошибок.

 */