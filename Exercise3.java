import Classes.BaseConvert;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        BaseConvert bc = new BaseConvert();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество градусов Цельсия: ");
        double toConvert = sc.nextDouble();
        System.out.println("Выберите конвертацию(1 - в Фаренгейты, 2 - в Кельвины): ");
        int choice = sc.nextInt();
        if (choice < 1 || choice > 2) {
            System.out.println("Введено некорректнное значение типа конвертации!");
        }
        else {
            toConvert = bc.convert(toConvert, choice);
            if(choice == 1){
                System.out.println("Конвертированное значение: " + toConvert + " F");
            }
            else {
                System.out.println("Конвертированное значение: " + toConvert + " K");
            }
        }
    }
}
