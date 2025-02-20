package alexey.Operators;

import java.util.Scanner;

public class TestOperatorsAlexey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение:");
        String str = scanner.nextLine();

        int lenght = str.length();

        System.out.println("Длина вашего предложения: " + lenght);

        scanner.close();

    }
}
