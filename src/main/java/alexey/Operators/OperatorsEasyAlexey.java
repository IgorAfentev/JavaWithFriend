/*Задание:
    Проверьте, является ли число чётным или нечётным, используя оператор %
 */
package alexey.Operators;

import java.util.Scanner;

public class OperatorsEasyAlexey {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int num = scanner.nextInt();
        if(num % 2 == 0)
        {System.out.print("Число четное");}
        else System.out.print("Число нечетное");
        scanner.close();
    }

}
