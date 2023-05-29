package atividades;

import java.util.Scanner;

public class River_verifier {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nivel do rio, em METROS: ");
        float nivel_mar = sc.nextFloat();

        if (nivel_mar < 3){
            System.out.println("O rio vai passar por um periodo de estiagem em breve!");
        }
        if(nivel_mar >= 7){
            System.out.println("O rio ira transbordar em breve!");
        }if(nivel_mar > 3 && nivel_mar < 7){
            System.out.println("O nível do rio está agradável!");
        }
    }
}

/* 2 - Crie um programa em java que verifica se o rio ira transbordar caso
ultrapasse 4m do seu leito, e se ira passar por um periodo de estiagem se estiver abaixo
do seu leito. levar em consideração o nivel do leito em 3m*/
