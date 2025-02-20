package alexey.Operators;

import java.util.Scanner;

public class AnotherCalculatorAlexey {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();

        System.out.println("Введите одну из операций +, -, *, / : ");
        char ch = scanner.next().charAt(0);

        switch (ch){

            case '+':
                System.out.printf("Результат суммирования: %d%n", x * y);
             break;

            case '-':
                System.out.printf("Результат вычитания: %d%n", x * y);
                break;

            case '*':
                System.out.printf("Результат умножения: %d%n", x * y);
                break;

            case '/':
                System.out.printf("Результат деления: %d%n", x * y);
                break;
        }

        scanner.close();

    }
}
