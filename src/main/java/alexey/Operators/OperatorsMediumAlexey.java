/*
Задание:
Напишите программу, которая проверяет, делится ли число на 3 и на 5 одновременно.
 */

package alexey.Operators;

import java.util.Scanner;

public class OperatorsMediumAlexey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите число для проверки: ");
        int num = scanner.nextInt();

        if(num % 3 ==0 && num % 5 == 0) {
            System.out.print("Число делится на 3 и на 5 без остатка. Ура!");
        } else {
            System.out.print("Число не делится на 3 и на 5 без остатка. Печаль!");
        }
        scanner.close();
    };
}

