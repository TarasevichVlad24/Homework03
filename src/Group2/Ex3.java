package Group2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String [] args){
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        a = s.nextInt();
        int sum = 0;
        for (int i = 1;i <= a; i++){
            sum = sum + i;
            System.out.print(" + " + i);
        }
            System.out.print(" = ");
            System.out.print(sum);


    }
}
