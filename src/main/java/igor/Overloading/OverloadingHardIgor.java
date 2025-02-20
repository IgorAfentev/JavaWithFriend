/* Задание:
    Реализуйте метод calculate(), который принимает два числа и оператор (+, -, *, /)
    и выполняет соответствующую операцию
 */

package igor.Overloading;
import java.util.Scanner;

public class OverloadingHardIgor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите математический пример для расчёта (например 2 * 2): ");
            String mathExample = scanner.nextLine();
            calculate(parseMathOperator(mathExample), getNumbers(mathExample));
        }

    }

    private static char parseMathOperator(String mathExample) {
        return mathExample.charAt(mathExample.indexOf(" ") + 1);
    }

    private static double[] getNumbers(String mathExample) {
        StringBuilder number1 = new StringBuilder();
        StringBuilder number2 = new StringBuilder();

        for (int i = 0; i < mathExample.length(); i++) {
            if (mathExample.charAt(i) != ' ') {
                number1.append(mathExample.charAt(i));
            } else {
                break;
            }
        }

        for (int i = mathExample.lastIndexOf(' ') + 1; i < mathExample.length(); i++) {
            number2.append(mathExample.charAt(i));
        }

        double numberOne = Double.parseDouble(number1.toString());
        double numberTwo = Double.parseDouble(number2.toString());

        return new double[]{numberOne, numberTwo};
    }

    private static void calculate(char operator, double[] numbers) {
        switch (operator) {
            case '+' -> System.out.println("Результат: "  + (numbers[0] + numbers[1]));
            case '-' -> System.out.println("Результат: "  + (numbers[0] - numbers[1]));
            case '*' -> System.out.println("Результат: "  + (numbers[0] * numbers[1]));
            case '/' -> System.out.println("Результат: "  + (numbers[0] / numbers[1]));
        }
    }
}

//Решение ChatGPT
class OverloadingHardIgorChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите математический пример для расчёта (например, 2 * 2): ");
            String mathExample = scanner.nextLine().trim();

            String[] parts = mathExample.split("\\s+"); // Разделение по пробелам

            if (parts.length != 3) {
                System.out.println("Ошибка! Некорректный ввод.");
                return;
            }

            double num1, num2;
            try {
                num1 = Double.parseDouble(parts[0]);
                num2 = Double.parseDouble(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введены некорректные числа.");
                return;
            }

            char operator = parts[1].charAt(0);
            calculate(operator, num1, num2);
        }
    }

    private static void calculate(char operator, double num1, double num2) {
        switch (operator) {
            case '+' -> System.out.println("Результат: " + (num1 + num2));
            case '-' -> System.out.println("Результат: " + (num1 - num2));
            case '*' -> System.out.println("Результат: " + (num1 * num2));
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Ошибка! Деление на ноль.");
                } else {
                    System.out.println("Результат: " + (num1 / num2));
                }
            }
            default -> System.out.println("Ошибка! Некорректный оператор.");
        }
    }
}

/*
🔹Что исправлено и улучшено?
✅ Простая разбивка строки с split() – избавляемся от сложного getNumbers().
✅ Проверка формата ввода – если частей в строке не 3 (число оператор число), программа выводит ошибку.
✅ Проверка чисел – если не удаётся преобразовать в double, программа не ломается.
✅ Защита от деления на ноль – предотвращаем ArithmeticException.
 */