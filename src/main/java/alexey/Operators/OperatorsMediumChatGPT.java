//Решение chatGPT
package alexey.Operators; // По соглашению имена пакетов должны быть в нижнем регистре, надо переделать!

import java.util.Scanner;

public class OperatorsMediumChatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки: ");
        int num = scanner.nextInt();

        boolean isDivisible = (num % 3 == 0 && num % 5 == 0);

        if (isDivisible) {
            System.out.println("Число делится на 3 и на 5 без остатка. Ура!");
        } else {
            System.out.println("Число не делится на 3 и на 5 без остатка. Печаль!");
        }

        scanner.close();
    }
}

/* Что улучшилось?

        ✅ Лучшее форматирование → Читаемость стала лучше.
✅ Использование переменной boolean → Код стал понятнее.
✅ Использование System.out.println → Текст выводится с новой строки.
✅ Использование package в нижнем регистре → Соответствует Java Code Conventions.

 */