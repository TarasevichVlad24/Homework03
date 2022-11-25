package Group1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] atgs){
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число:  ");
        a = s.nextInt();

        if (a % 2 == 1) {
            System.out.println("Число нечётное");
        } else {
            System.out.println("Число чётное");
        }
    }
}
