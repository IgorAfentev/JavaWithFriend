/*Задание:
    Напишите программу, которая запрашивает у пользователя два числа
    (целое и дробное) и выводит их сумму, разность и произведение
 */

package igor.Variables;

//Моё решение
import java.util.Scanner;
import static java.util.Locale.US; //Добавил US, чтобы определялась точка при вводе с клавиатуры

public class VariablesMedium {

    public static void main(String[] args) {

        int intNumber;
        double doubleNumber;

        Scanner in = new Scanner(System.in).useLocale(US);
        System.out.println("Введите целое число: ");
        intNumber = in.nextInt();
        System.out.println("Введите дробное число: ");
        doubleNumber = in.nextDouble();

        System.out.printf("Сумма чисел: %f%n", intNumber + doubleNumber);
        System.out.printf("Разность чисел: %f%n", intNumber - doubleNumber);
        System.out.printf("Произведение чисел: %f%n", intNumber * doubleNumber);
    }

}

//Решение Chat GPT
//import java.util.Scanner;
//import java.util.Locale;

class VariablesMediumChat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //.useLocale(Locale.US);

        System.out.print("Введите целое число: ");
        int intNumber = in.nextInt();

        System.out.print("Введите дробное число: ");
        double doubleNumber = in.nextDouble();

        System.out.printf("Сумма чисел: %.2f%n", intNumber + doubleNumber);
        System.out.printf("Разность чисел: %.2f%n", intNumber - doubleNumber);
        System.out.printf("Произведение чисел: %.2f%n", intNumber * doubleNumber);

        in.close();
    }
}

/*
🔹 Что исправлено?
✅ Правильный импорт Locale
✅ Использование %.2f для красивого вывода
✅ Добавлено in.close(); (закрытие Scanner)
✅ Убраны лишние переменные: сразу присваиваем значения intNumber и doubleNumber
*/

