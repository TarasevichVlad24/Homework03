package Group1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        int color;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите номер цвета радуги:  ");
        color = s.nextInt();
         String colorString;

        switch (color){
            case 1: colorString = "Красный";
            break;
            case 2: colorString = "Оранжевый";
            break;
            case 3: colorString = "Жёлтый";
            break;
            case 4: colorString = "Зелёный";
            break;
            case 5: colorString = "Голубой";
            break;
            case 6: colorString = "Синий";
            break;
            case 7: colorString = "Фиолетовый";
            break;
            default: colorString = "Нет такого цвета";
            break;
        }
        System.out.println(colorString);
    }
}
