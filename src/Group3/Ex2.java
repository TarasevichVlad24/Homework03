package Group3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = s.nextFloat();
        System.out.print("Введите срок вклада: ");
        int srok = s.nextInt();

        for (int i = 1; i <= srok; i++){
            sum += sum *= 0.07;
        }
        System.out.print("Итог: " +sum);



    }
}
