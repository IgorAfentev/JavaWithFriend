/*Задание:
    Объявите переменные типов int, double, char, boolean,
    присвойте им значения и выведите их на экран
 */

package igor.Variables;

//Моё решение
public class VariablesEasy {

    static int intNumber = 23;
    static double doubleNumber = 3.14;
    static char charSymbol = 'I';
    static boolean boolValue = true;

    public static void main() {
        System.out.printf("Целое число: %d%n", intNumber);
        System.out.printf("Дробное число: %f%n", doubleNumber);
        System.out.printf("Строчный символ: %c%n", charSymbol);
        System.out.printf("Логическое выржение: %b%n", boolValue);
    }
}

//Решение Chat GPT
class VariablesEasyChat {

    public static void main(String[] args) {
        int intNumber = 23;
        double doubleNumber = 3.14;
        char charSymbol = 'I';
        boolean boolValue = true;

        System.out.printf("Целое число: %d%n", intNumber);
        System.out.printf("Дробное число: %.2f%n", doubleNumber);
        System.out.printf("Строчный символ: %c%n", charSymbol);
        System.out.printf("Логическое выражение: %b%n", boolValue);
    }
}

/*
🔹 Что улучшено?
✅ Удалён static у переменных – они теперь локальные в main().
✅ Добавлен параметр String[] args в main(), чтобы программа запускалась.
✅ Использован %.2f для double, чтобы убрать лишние нули (3.14 вместо 3.140000).
 */