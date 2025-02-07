/*Задание:
    Создайте программу, которая определяет тип треугольника
    (равносторонний, равнобедренный, разносторонний) по введённым сторонам.
 */

//Моё решение
package igor.Branching;
import java.util.Scanner;

public class BranchingHard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первой стороны: ");
        int side1 = scanner.nextInt();
        System.out.print("Введите длину второй стороны: ");
        int side2 = scanner.nextInt();
        System.out.print("Введите длину третьей стороны: ");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 != side3 ||
                side1 == side3 && side3 != side2 ||
                side2 == side3 && side3 != side1) {
            System.out.print("Треугольник равнобедренный");
        } else if (side1 == side2) {
            System.out.print("Треугольник равносторонний");
        } else {
            System.out.print("Треугольник разносторонний");
        }

        scanner.close();

    }
}

//Решение ChatGPT
//import java.util.Scanner;

class BranchingHardChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первой стороны: ");
        int side1 = scanner.nextInt();
        System.out.print("Введите длину второй стороны: ");
        int side2 = scanner.nextInt();
        System.out.print("Введите длину третьей стороны: ");
        int side3 = scanner.nextInt();

        // Проверка на существование треугольника
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Треугольник равносторонний");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Треугольник равнобедренный");
            } else {
                System.out.println("Треугольник разносторонний");
            }
        } else {
            System.out.println("Такого треугольника не существует!");
        }

        scanner.close();
    }
}

/*
🔹 Что улучшено?
✅ Добавлена проверка существования треугольника
✅ Исправлена логика определения типа треугольника
✅ Использован println вместо print
 */