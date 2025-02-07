/*Задание:
    Выведите на экран числа от 1 до 10 с помощью for
 */

//Моё решение
package igor.Cycles;

public class CyclesEasy {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
    }
}

//Решение ChatGPT
class CyclesEasyChat {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}

/*
🔹 Возможные улучшения:
✅ Использование <= вместо <
✅ Использование println для более удобного вывода
 */