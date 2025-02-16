/*
Задание:
Напишите программу-калькулятор, которая запрашивает два числа и оператор (+, -, *, /), а затем выполняет соответствующую операцию.
 */

package alexey.Operators;

import java.util.Scanner;

public class OperatorsHardAlexey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1 = ");
        int num1 = scanner.nextInt();

        System.out.println("Введите число 2 = ");
        int num2 = scanner.nextInt();

        System.out.println("Выберите операцию +, -, *, /, = ");
        char cha = scanner.next().charAt(0);

        if(cha == '+'){
            System.out.printf("Результат сложения: %d%n", num1 + num2);
        } else if(cha == '-') {
            System.out.printf("Результат вычитания: %d%n", num1 - num2);
        } else if (cha == '*') {
            System.out.printf("Результат умножения: %d%n", num1 * num2);
        }
        else if (cha == '/') {
            System.out.printf("Результат деления: %d%n", num1 / num2);
        }
        else {
            System.out.println("Введена недопустимая операция с числами");
        }

        scanner.close();
    }
}
