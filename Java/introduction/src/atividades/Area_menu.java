package Exercises.introduction.src.atividades;

import java.util.Scanner;

public class Area_menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("selecione a area que deseja calcular \n\n" +
                "1 - Triângulo \n" +
                "2 - Retângulo \n" +
                "3 - Circulo \n" +
                "4 - Quadrado\n" +
                "5 - Losangulo");

        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("Insira o comprimento da base e da altura.");
            System.out.println("Base: ");
            float base = sc.nextFloat();
            System.out.println("Altura: ");
            float altura = sc.nextFloat();
            System.out.printf("%.2f * %.2f / 2 = %.2f", base, altura, (base * altura) / 2);


        } else if (escolha == 2) {
            System.out.println("Insira o comprimento da base e da altura.");
            System.out.println("Base: ");
            float base = sc.nextFloat();
            System.out.println("Altura: ");
            float altura = sc.nextFloat();
            System.out.printf("%.2f * %.2f = %.2f", base, altura, base * altura);


        } else if (escolha == 3) {
            System.out.println("Insira o valor do raio e de pi.");
            System.out.println("Raio: ");
            float raio = sc.nextFloat();
            System.out.println("PI: ");
            float PI = sc.nextFloat();
            System.out.printf("%.2f^2 * %.2f = %.2f", raio, PI, (raio * raio) * PI);


        } else if (escolha == 4) {
            System.out.println("Insira o comprimento do lado.");
            System.out.println("Lado: ");
            float base = sc.nextFloat();
            System.out.printf("%.2f * %.2f = %.2f", base, base, base * base);


        } else if (escolha == 5) {
            System.out.println("Insira o comprimento da diagonal MAIOR e da diagonal MENOR.");
            System.out.println("MAIOR: ");
            float base = sc.nextFloat();
            System.out.println("MENOR: ");
            float altura = sc.nextFloat();
            System.out.printf("%.2f * %.2f / 2 = %.2f", base, altura, (base * altura) / 2);
        }

        /* Enviar para rodrigotemateo@etec.sp.gov */


    }

}
