/*Задание:
    Создайте двумерный массив (3x3), заполните его числами и выведите его в виде таблицы
 */

//Моё решение
package igor.Arrays;
import java.util.Random;

public class ArraysHard {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] doubleArrayOfRandomNumbers = new int[3][3];

        for (int i = 0; i < doubleArrayOfRandomNumbers.length; i++) {
            for (int j = 0; j < doubleArrayOfRandomNumbers[i].length; j++) {
                doubleArrayOfRandomNumbers[i][j] = random.nextInt(200);
            }
        }

        for (int[] doubleArrayOfRandomNumber : doubleArrayOfRandomNumbers) {
            for (int i : doubleArrayOfRandomNumber) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }
}

//Решение ChatGPT
class ArraysHardChat {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] doubleArrayOfRandomNumbers = new int[3][3];

        for (int i = 0; i < doubleArrayOfRandomNumbers.length; i++) {
            for (int j = 0; j < doubleArrayOfRandomNumbers[i].length; j++) {
                doubleArrayOfRandomNumbers[i][j] = random.nextInt(200);
            }
        }

        for (int[] doubleArrayOfRandomNumber : doubleArrayOfRandomNumbers) {
            for (int i : doubleArrayOfRandomNumber) {
                System.out.printf("%4d\t", i);
            }
            System.out.println();
        }
    }
}

/*
🔹 Что изменилось и почему?
✅ Используем System.out.printf("%4d ", i) для увеличения ширины столбцов (для красивого вывода)
 */