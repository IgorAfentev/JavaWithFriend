/*Задание:
    Проверьте, является ли число чётным или нечётным, используя оператор %
 */

//Моё решение
package igor.Operators;
import java.util.Scanner;

public class OperatorsEasy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для проверки его на чётность: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }

        scanner.close();
    }
}

//Решение ChatGPT
//import java.util.Scanner;

class OperatorsEasyChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки его на чётность: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "Число чётное" : "Число нечётное";
        System.out.println(result);

        scanner.close();
    }
}

/*
🔹 Что улучшено?
✅ Использован тернарный оператор ? : для лаконичности
✅ System.out.print() вместо println() для ввода в одной строке
✅ Код стал короче и читабельнее
 */