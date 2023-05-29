package atividades;

import java.util.Scanner;

public class Velocity {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the travel lenght(km): ");
        float espaco_percorrido = sc.nextFloat();
        System.out.println("Insert the time spent(hours): ");
        float horas = sc.nextFloat();


        float average_velocity = espaco_percorrido / horas;

        if (average_velocity <= 80){
            System.out.printf("You are safe!\nYour average velocity: %f km/h", average_velocity);
        }else{
            System.out.printf("You are fined!\nYour average velocity: %f km/h\nAcceptable velocity: 80", average_velocity);
        }
    }
}
