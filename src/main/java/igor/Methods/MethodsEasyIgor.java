/* Задание:
    Напишите метод, который принимает имя и выводит приветствие ("Привет, имя!")
 */

//Моё решение
package igor.Methods;
import java.util.Scanner;

public class MethodsEasyIgor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        hello(name);

        scanner.close();
    }

    static void hello(String name) {

        System.out.printf("Привет, %s!%n", name);
    }
}

//Решение ChatGPT
//import java.util.Scanner;

class MethodsEasyIgorChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Автоматическое закрытие Scanner
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            hello(name);
        }
    }

    static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }
}

/*
🔹 Возможные улучшения:
✅ try-with-resources для Scanner //Для автоматического закрытия сканера (Есть конспект)
 */
