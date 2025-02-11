/*Задание:
    Напишите программу, которая запрашивает у пользователя два числа
    (целое и дробное) и выводит их сумму, разность и произведение
 */
package alexey.Variables;

import java.util.Scanner;

public class VariablesMediumAlexey {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//Лучше делать Scanner scanner для того чтобы избежать ошибок при вводе
        System.out.print("Введите число с плавающей запятой = ");
        float x = scanner.nextFloat();
        System.out.print("Введите целое число = ");
        int y = scanner.nextInt();
        float a = x + y;
        System.out.printf("Сумма = %.2f\n", a);
        float b = x - y;
        System.out.printf("Разность = %.2f\n", b);
        float c = x * y;
        System.out.printf("Произведение = %.2f\n", c);
        scanner.close();
    }
}
