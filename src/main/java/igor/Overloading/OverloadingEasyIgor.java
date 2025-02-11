/*Задание:
    Создайте два метода print(): один принимает строку, второй – число
 */

//Моё решение
package igor.Overloading;
import java.util.Scanner;

public class OverloadingEasyIgor {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String someString = "Привет! Я строка!";
            int someInt = 23;
            System.out.println(print(someString));
            System.out.println(print(someInt));
        }
    }

    static String print(String phrase) {
        return phrase;
    }

    static int print(int number) {
        return number;
    }
}

//Решение ChatGPT
class OverloadingEasyIgorChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String someString = "Привет! Я строка!";
            int someInt = 23;

            print(someString);
            print(someInt);
        }
    }

    static void print(String phrase) {
        System.out.println(phrase);
    }

    static void print(int number) {
        System.out.println(number);
    }
}

/*
🔹 Что было исправлено?:
✅ Методы print() теперь void, потому что они просто выводят данные, а не возвращают их
✅ В main больше нет System.out.println(print(...)), теперь просто print(...)
 */