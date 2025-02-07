/*Задание:
    Создайте массив из 5 чисел, заполните его значениями и выведите на экран
 */

//Моё решение
package igor.Arrays;

public class ArraysEasy {

    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[] {1, 5, 2, 8, 2};

        for (int i : arrayOfNumbers) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }
}

//Решение ChatGPT
//import java.util.Arrays;

class ArraysEasyChat {
    public static void main(String[] args) {
        // Создаём массив из 5 чисел
        int[] arrayOfNumbers = {1, 5, 2, 8, 2};

        // Вывод массива в строковом формате
        //System.out.println(Arrays.toString(arrayOfNumbers)); //Коммент, т. к. нет импорта
    }
}

/*
🔹 Что изменилось и почему?
✅ Убрали new int[], так как это не требуется при явной инициализации.
✅ Используем Arrays.toString(), что проще и удобнее для вывода массивов.
✅ Код стал компактнее и читаемее.
 */