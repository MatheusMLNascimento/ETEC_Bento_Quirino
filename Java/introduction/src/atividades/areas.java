package atividades;

import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");

        System.out.println("Selecione o tipo de area que você quer calcular");

        System.out.println("===============================================");

        System.out.println("Opições \n 1 - Triangulo \n 2 - Retangulo \n 3 - Quadrado \n 4 - Circulo \n 5 - Losangulo");

        String sign = sc.next();
        switch (sign){
            case "1":
                int result = sc.nextInt();
                System.out.println("Insira a base do triangulo");
                int baseTri = sc.nextInt();
                System.out.println("Insira a altura do triangulo");
                int alturaTri = sc.nextInt();
                result = (baseTri * alturaTri)/2;
                System.out.println("A area do seu triangulo é "+result);
                break;
            case "2":

                System.out.println("Insira o valor da base");
                int baseRet = sc.nextInt();
                System.out.println("insira o valor da altura");
                int alturaRet = sc.nextInt();

        }

    }
}
