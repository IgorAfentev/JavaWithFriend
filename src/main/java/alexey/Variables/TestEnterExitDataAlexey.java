package alexey.Variables;

import java.util.Scanner;

public class TestEnterExitDataAlexey {
    public static void main(String[] args){
        System.out.print("Привет, мир!\n");
        System.out.print("Привет, всем!\n");
        int x = 10;
        int y = 22;
        System.out.println("x = " + x + "; y = " + y);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = in.nextLine();
        System.out.println("Enter age:");
        int age = in.nextInt();
        System.out.println("Enter height:");
        float height = in.nextFloat();
        System.out.println("Name:" + name + ", Age: " + age + ", Height: " + height + "cm");
        in.close();
    }
}
