/*Задание:
    Напишите программу, которая вычисляет среднее арифметическое трех введённых
    пользователем чисел, округляет результат до двух знаков после запятой
 */

//Моё решение
package alexey.Variables;

import java.util.Scanner;

public class VariablesHardAlexey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число номер один: ");
        float x = scanner.nextFloat();
        System.out.print("Введите число номер два: ");
        float y = scanner.nextFloat();
        System.out.print("Введите число номер три: ");
        float z = scanner.nextFloat();
        System.out.printf("Среднее арифметическое = %.2f", (x + y + z)/(3));
        scanner.close();
    }
}
