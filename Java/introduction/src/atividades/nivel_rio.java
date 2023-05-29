package atividades;

import java.util.Scanner;

public class nivel_rio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("insira o valor do nível do rio");
        float nivelrio = sc.nextFloat();

        if (nivelrio >= 7 ) {
            System.out.println("rio vai transbordar");

        } else if (nivelrio <= 3) {

            System.out.println("rio em estiagem");

        } else {
            System.out.println("dentro do limite");

        }
    }
}


