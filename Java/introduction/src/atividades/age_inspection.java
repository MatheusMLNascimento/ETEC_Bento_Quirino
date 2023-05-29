package atividades;

import java.util.Scanner;

public class age_inspection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your age to know if you are a baby, a child, a teenager or an elderly:");
        int age = sc.nextInt();

        if (age >=0 && age <=2){
            System.out.println("You are a Baby!");
        }else if(age >=3 && age <=12){
            System.out.println("You are a Child!");
        } else if (age >=13 && age <=17) {
            System.out.println("You are a Teenager!");
        } else if (age >=18 && age <=59) {
            System.out.println("You are a Adult!");
        } else if (age >=60 && age <=99){
            System.out.println("You are a Elderly!");
        }else{
            System.out.println("Your hour is coming... Prepare to turn dust!");
        }

        }
    }