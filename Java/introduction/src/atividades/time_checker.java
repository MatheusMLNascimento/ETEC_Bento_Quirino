package atividades;

import java.util.Scanner;


public class time_checker {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /* Hora em ponto */
        int hora_chegada = 480;

        /* Recebe horas de chegada */
        System.out.println("Horário do ponto: ");
        int horas = sc.nextInt();

        /* Recebe minutos de chegada */
        System.out.println("Minutos: ");
        int minutos = sc.nextInt();

        /* Transforma as horas em minutos e soma tudo */
        int tempo_minutos = (horas * 60) + minutos;

        /* Calcula diferença entre o horario em ponto e a hora de chegada, tudo em minutos */
        float calculo_tempo = tempo_minutos - hora_chegada;


        System.out.printf("Tempo diferencial: %.0f minutos", calculo_tempo);

        if (calculo_tempo < 0){
            System.out.println("\nVocê chegou adiantado! Parabéns!");
        }else if(calculo_tempo > 0){
            System.out.println("\nVocê chegou atrasado! Cuidado com os atrasos!");
        }
        if(calculo_tempo == 0){
            System.out.println("\nVocê chegou no horário!");
        }
    }
}


/* 2 - Crie um programa em java que verifica se o rio ira transbordar caso
ultrapasse 4m do seu leito, e se ira passar por um periodo de estiagem se estiver abaixo
do seu leito. levar em consideração o nivel do leito em 3m*/




/* 3 - crie um programa em java que receba a distancia que sera percorrida por um caminhoneiro
e o tempo gasto pelo valor do diesel  calcule quanto tempo sera gasto para realizar o frete
e o valor gasto em combustilvel, depois diga se o frete vai valer a pena
ou se não vai valer ou se os gastos serão iguas aos lucros, apresente essas informções ao usuário
média de consumo sera igual = 4/km por L.
O caminhoneiro so poderqa dirigir por 8 horas*/