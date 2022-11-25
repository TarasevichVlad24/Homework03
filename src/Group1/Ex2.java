package Group1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите номер месяца:  ");
        a = s.nextInt();
        if (a == 1 || a == 2 || a == 12){
            System.out.println("Зима");
        } else if (a == 3 || a == 4 || a == 5){
            System.out.println("Весна");
        } else if (a == 6 || a == 7 || a == 8){
            System.out.println("Лето");
        } else if (a == 9 || a == 10 || a == 11){
            System.out.println("Осень");
        } else{
            System.out.println(a + "-го месяца не существует");
        }
    }
}
