/* Задание:
    Напишите метод, который принимает массив чисел и возвращает его максимальный элемент
 */

//Моё решение
package igor.MethodsParameters;
import java.util.Arrays;
import java.util.Random;

public class MethodsParametersHardIgor {

    public static void main(String[] args) {
        int[] array = generatorOfArray();
        System.out.println("Сгенерированный массив: \n" + Arrays.toString(array));
        System.out.println("Максимальный элемент этого массива: \n" + maxElementOfArray(array));
    }

    private static int[] generatorOfArray() {
        Random random = new Random();

        int[] arrayOfRandomNumbers = new int[10];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(100);
        }

        return arrayOfRandomNumbers;
    }

    static int maxElementOfArray(int[] arrayOfNumbers) {
        if (Arrays.stream(arrayOfNumbers).max().isPresent()) {
            return Arrays.stream(arrayOfNumbers).max().getAsInt();
        } else {
            return -1;
        }
    }
}

//Решение ChatGPT
class MethodsParametersHardIgorChat {

    public static void main(String[] args) {
        int[] array = generatorOfArray();
        System.out.println("Сгенерированный массив: \n" + Arrays.toString(array));
        System.out.println("Максимальный элемент этого массива: \n" + maxElementOfArray(array));
    }

    private static int[] generatorOfArray() {
        Random random = new Random();
        int[] arrayOfRandomNumbers = new int[10];

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(100); // 0-99
        }
        return arrayOfRandomNumbers;
    }

    static int maxElementOfArray(int[] arrayOfNumbers) {
        return Arrays.stream(arrayOfNumbers).max().orElse(-1);
    }
}

/*
🔹 Что было улучшено?:
✅ Сохранили поток в переменную OptionalInt max
✅ Заменили isPresent() и getAsInt() на orElse(-1)
 */