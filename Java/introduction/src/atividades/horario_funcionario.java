package atividades;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class horario_funcionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("insira o horário de entrada, em horas");
        float horarioentrada = sc.nextFloat();

        System.out.println("insira os minutos da entrada");
        float minutosentrada = sc.nextFloat();

        float equacao = horarioentrada * 60 + minutosentrada;
        System.out.println(equacao);

        float diferenca_min_passados = equacao - 8*60;
        System.out.println("diferença em relação ao horário de entrada em módulo [min]" + diferenca_min_passados);

        System.out.print(horarioentrada + "h" );
        System.out.println(minutosentrada + "min");


        if (horarioentrada == 8 && minutosentrada == 0 ) {
            System.out.println("chegou no horario");

        } else if (horarioentrada < 8 && minutosentrada < 60) {

            System.out.println("chegou adiantado");

        } else {
            System.out.println("chegou atrasado");

        }
    }
}

