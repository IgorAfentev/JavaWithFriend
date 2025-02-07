/*Задание:
    Найдите сумму всех элементов в массиве из 10 случайных чисел
 */

//Моё решение
package igor.Arrays;
import java.util.Arrays;
import java.util.Random;

public class ArraysMedium {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayOfRandomNumbers = new int[10];

        for (int i = 0; i <= 9; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(100);
        }

        System.out.printf("Сумма элементов массива: %d%n", Arrays.stream(arrayOfRandomNumbers).sum());
    }
}

//Решение ChatGPT
//import java.util.Arrays;
//import java.util.Random;

class ArraysMediumChat {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayOfRandomNumbers = new int[10];

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(100);
        }

        System.out.printf("Сумма элементов массива: %d%n", Arrays.stream(arrayOfRandomNumbers).sum());
    }
}

/*
🔹 Что изменилось и почему?
✅ Используем i < arrayOfRandomNumbers.length. Это делает код более гибким
 */
