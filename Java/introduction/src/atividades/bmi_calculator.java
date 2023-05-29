package atividades;

import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bmi calculator\nInsert your height(cm):");
        int height = sc.nextInt();
        System.out.println("Insert your weight:");
        float weight = sc.nextFloat();

        int height2x = height * height;
        double average = weight / height2x;
        float average_format = (float) (average * 10000f);
        System.out.printf("\nYour BMI score: %.1f Kg/m²\n", average_format);
        if (average_format < 18){
            System.out.println("Your BMI indicates that you're" + "\033[0;34m under weight!");
        } else if (average_format >= 18 && average_format < 25) {
            System.out.println("Your BMI indicates that you're" + "\033[0;32m healthy weight!");
        } else if (average_format >= 26 && average_format <= 30) {
            System.out.println("Your BMI indicates that you're" + "\033[0;35m above weight!");
        } else if (average_format >= 31 && average_format <= 40) {
            System.out.println("Your BMI indicates that you have" + "\033[0;33m moderate obesity!");
        } else if (average_format >= 41 && average_format <= 50) {
            System.out.println("Your BMI indicates that you have" + "\033[0;31m severe obesity!");
        }else{
            System.out.println("Your BMI indicates that you have" + "\033[0;37m very serious obesity!");
        }

    }
}
