/*Задание:
    Запросите у пользователя возраст и выведите, является ли он совершеннолетним
 */

//Моё решение
package igor.Branching;
import java.util.Scanner;

public class BranchingEasy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        String result = (age >= 18) ? "Вы совершеннолетний!" : "Вы не совершеннолетний!";
        System.out.println(result);
    }
}

//Решение ChatGPT
//import java.util.Scanner;

class BranchingEasyChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        System.out.println(age >= 18 ? "Вы совершеннолетний!" : "Вы не совершеннолетний!");

        scanner.close(); // Закрываем Scanner
    }
}

/*
🔹 Что улучшено?
✅ Добавлено in.close(); (закрытие Scanner)
✅ Убрана переменная result
 */