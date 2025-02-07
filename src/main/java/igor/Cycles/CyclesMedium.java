/*Задание:
    Выведите все числа от 1 до 100, которые делятся на 7 без остатка, используя while
 */

//Моё решение
package igor.Cycles;

public class CyclesMedium {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            if (i % 7 == 0) {
                System.out.printf("%d ", i);
            }
            i++;
        }
        System.out.println();
    }
}

//Решение ChatGPT
class CyclesMediumChat {
    public static void main(String[] args) {
        int i = 7; // Начинаем с первого числа, кратного 7
        while (i <= 100) {
            System.out.printf("%d ", i);
            i += 7; // Переход сразу к следующему кратному 7
        }
        System.out.println();
    }
}

/*
🔹Преимущества улучшенной версии:
✅ Меньше итераций (i изменяется с шагом 7, а не 1)
✅ Исключена ненужная проверка (if)
 */
