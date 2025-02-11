/* Задание:
    Напишите метод, который принимает строку и проверяет, является ли она палиндромом
 */

//Моё решение
package igor.Methods;
import java.util.Scanner;

public class MethodsHardIgor {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для проверки на палиндром: ");
            String phrase = scanner.nextLine();

            System.out.println(isPalindrome(phrase) ? "Это палиндром!" : "Это не палиндром!");
        }
    }

    static boolean isPalindrome(String phrase) {

        StringBuilder reversePhrase = new StringBuilder();

        for(int i = phrase.length() - 1; i >= 0; i--) {
            reversePhrase.append(phrase.charAt(i));
        }

        return phrase.contentEquals(reversePhrase);
    }
}

//Решение ChatGPT
class MethodsHardIgorChat {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для проверки на палиндром: ");
            String phrase = scanner.nextLine();

            System.out.println(isPalindrome(phrase) ? "Это палиндром!" : "Это не палиндром!");
        }
    }

    static boolean isPalindrome(String phrase) {
        // Убираем пробелы, знаки препинания и приводим к нижнему регистру
        String cleaned = phrase.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();

        // Сравниваем строку с её перевёрнутым вариантом
        return cleaned.contentEquals(new StringBuilder(cleaned).reverse());
    }
}

/*
🔹 Что улучшилось?:
✅ Игнорируются пробелы, знаки препинания и регистр
✅ Код стал короче → убрали цикл, заменив reverse()
✅ Работает быстрее → теперь сравниваем только буквы и цифры
 */