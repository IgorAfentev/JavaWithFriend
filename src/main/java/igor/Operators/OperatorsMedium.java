/*Задание:
    Напишите программу, которая проверяет, делится ли число на 3 и на 5 одновременно
 */

//Моё решение
package igor.Operators;
import java.util.Scanner;

public class OperatorsMedium {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();

        String check = (number % 3 == 0 && number % 5 == 0) ? "Число подходит" : "Число не подходит";
        System.out.println(check);

        scanner.close();
    }

}

//Решение ChatGPT
//import java.util.Scanner;

class OperatorsMediumChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Число делится на 3 и на 5");
        } else {
            System.out.println("Число не делится на 3 и на 5 одновременно");
        }

        scanner.close();
    }
}

/*
🔹 Что улучшено?
✅ Заменён тернарный оператор на if-else
Почему? В данном случае if-else делает код более читаемым, так как условие достаточно важное.
✅ Более понятные сообщения
Теперь сообщение явно говорит на что делится число.
 */

