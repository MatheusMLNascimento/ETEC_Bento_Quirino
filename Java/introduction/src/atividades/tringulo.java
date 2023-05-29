package atividades;

import java.util.Scanner;

public class tringulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your triangle sides sizes:");
        float side1 = sc.nextFloat();
        System.out.println("Side 2: ");
        float side2 = sc.nextFloat();
        System.out.println("Side 3: ");
        float side3 = sc.nextFloat();

        if (side1 == side2 && side2 == side3){
            System.out.println("Your triangle is a equilateral triangle!");
        } else if (side1 != side2 && side2 == side3) {
            System.out.println("Your triangle is a isosceles triangle!");
        } else if (side1 == side2 && side2 != side3) {
            System.out.println("Your triangle is a isosceles triangle!");
        } else if (side1 != side2 && side2 != side3 && side1 == side3) {
            System.out.println("Your triangle is a isosceles triangle!");
        } else if (side1 != side2 && side2 != side3) {
            System.out.println("Your triangle is a scalene triangle");
        }

    }
}
