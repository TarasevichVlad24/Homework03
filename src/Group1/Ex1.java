package Group1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите номер месяца:  ");
        a = s.nextInt();

        switch (a) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 5, 4 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println(a + "-го месяца не существует");
        }
    }
}
