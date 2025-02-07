/*Задание:
    Напишите программу, которая запрашивает у пользователя день недели (1–7) и
    выводит соответствующее название дня с помощью switch-case
 */

//Моё решение
package igor.Branching;
import java.util.Scanner;

public class BranchingMedium {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.print("Вы ввели недопустимое значение!");
        }

        scanner.close();

    }
}

//Решение ChatGPT
//import java.util.Scanner;

class BranchingMediumChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Ошибка! Введите число от 1 до 7.");
        }

        scanner.close();
    }
}

/*
✅ Использование default с println
✅ Использование switch с -> (Java 12+)
 */