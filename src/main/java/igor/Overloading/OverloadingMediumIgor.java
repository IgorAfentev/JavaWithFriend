/*Задание:
    Напишите три метода multiply(), которые перемножают два числа разных типов (int, double, float)
 */

//Моё решение
package igor.Overloading;
import java.util.Scanner;

public class OverloadingMediumIgor {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int dataType;
            String text = """
                    Выберите тип данных:
                    1 - Integer
                    2 - Double
                    3 - Float
                    """;

            System.out.println(text);
            dataType = scanner.nextInt();
            switch (dataType) {
                case 1 -> System.out.println("Результат умножения чисел: " + multiply(getIntNumbers()));
                case 2 -> System.out.println("Результат умножения чисел: " + multiply(getDoubleNumbers()));
                case 3 -> System.out.println("Результат умножения чисел: " + multiply(getFloatNumbers()));
            }
        }
    }

    private static int[] getIntNumbers() {
        int[] arrayOfIntNumbers = new int[2];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            arrayOfIntNumbers[0] = scanner.nextInt();

            System.out.print("Введите второе число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            arrayOfIntNumbers[1] = scanner.nextInt();
        }
        return arrayOfIntNumbers;
    }

    private static double[] getDoubleNumbers() {
        double[] arrayOfIntNumbers = new double[2];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            arrayOfIntNumbers[0] = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            arrayOfIntNumbers[1] = scanner.nextDouble();
        }
        return arrayOfIntNumbers;
    }

    private static float[] getFloatNumbers() {
        float[] arrayOfFloatNumbers = new float[2];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            while (!scanner.hasNextFloat()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            arrayOfFloatNumbers[0] = scanner.nextFloat();

            System.out.print("Введите второе число: ");
            while (!scanner.hasNextFloat()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            arrayOfFloatNumbers[1] = scanner.nextFloat();
        }
        return arrayOfFloatNumbers;
    }

    static int multiply(int[] args) {
        return args[0] * args[1];
    }

    static double multiply(double[] args) {
        return args[0] * args[1];
    }

    static float multiply(float[] args) {
        return args[0] * args[1];
    }
}

//Решение ChatGPT
class OverloadingMediumIgorChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            Number num1 = getNumber(scanner);

            System.out.print("Введите второе число: ");
            Number num2 = getNumber(scanner);

            if (num1 instanceof Integer && num2 instanceof Integer) {
                System.out.println("Результат умножения: " + multiply(num1.intValue(), num2.intValue()));
            } else if (num1 instanceof Double || num2 instanceof Double) {
                System.out.println("Результат умножения: " + multiply(num1.doubleValue(), num2.doubleValue()));
            } else {
                System.out.println("Результат умножения: " + multiply(num1.floatValue(), num2.floatValue()));
            }
        }
    }

    private static Number getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            } else {
                System.out.println("Ошибка! Введите корректное число.");
                scanner.next();
            }
        }
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static float multiply(float a, float b) {
        return a * b;
    }
}

/*
🔹Что изменилось?
✅ Нет меню выбора типа данных – программа автоматически определяет введённые числа
✅ Упрощена логика – пользователь просто вводит два числа, а код сам выбирает нужный метод multiply()
✅ Работает с любыми комбинациями типов – если одно число int, а второе double, программа использует double multiply()
 */