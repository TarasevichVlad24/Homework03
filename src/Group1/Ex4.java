package Group1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        int t;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите температуру:  ");
        t = s.nextInt();

        if (t > -5){
            System.out.println("Тепло");
        } else if (t <= -5 && t> -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
