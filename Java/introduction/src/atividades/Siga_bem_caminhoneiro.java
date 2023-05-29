package atividades;

import java.util.Scanner;

public class Siga_bem_caminhoneiro {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /* Recebe a distancia */
        System.out.println("Insira a distancia percorrida, em KILOMETROS (mínimo: 619 Km)");
        float distancia_percorrida = sc.nextFloat();

        /* Valor diesel: R$ 6,00 */
        float valor_diesel = 6.00F;

        /* valor combustível = valor diesel X (distancia / 4) */
        float valor_combustivel = valor_diesel * (distancia_percorrida / 4);
        System.out.printf("\nValor combustivel: R$ %.2f", valor_combustivel);

        /* dias de trabalho = total percorrido divido pelo máximo que o caminhoneiro pode rodar por dia (680 km); */
        float dias_trabalho = distancia_percorrida / 680;
        System.out.printf("\nDias de trabalho (aprox): %.0f", dias_trabalho);

        /* Gasto de diesel (Litros)*/
        float gasto_litros = distancia_percorrida / 4;
        System.out.printf("\nTotal de diesel gasto: %.2fL", gasto_litros);

        /* Tempo total em horas */
        float tempo_gasto = dias_trabalho * 8;
        System.out.printf("\nTempo total: %.0f horas",tempo_gasto);

        /* Cada 10 km R$ 45,00 de frete */
        float calculo_frete = (distancia_percorrida / 10) * 45;
        System.out.printf("\nFrete: R$ %.2f",calculo_frete);

        /* Pagamento do caminhoneiro = R$ 50,00/h */
        float pagamento_caminhoneiro = 50 * tempo_gasto;
        System.out.printf("\nPagamento do caminhoneiro: R$ %.2f", pagamento_caminhoneiro);

        /* Rascunho 
        Vel máxima para transporte de carga pesada = 85km/h
        * KM máximo p/ dia = 680km
        float tempo_transporte_caminhao = tempo_gasto;
        System.out.printf("\nO caminhão rodou %.0f horas por dia", tempo_transporte_caminhao);
        */

        System.out.println("\n\033[0;34m========================================");

        /* Lucro da empresa */
        float calculo_lucro = calculo_frete - (valor_combustivel + pagamento_caminhoneiro) ;

        System.out.printf("\033[0;31mGastos: R$ %.2f", valor_combustivel + pagamento_caminhoneiro);
        System.out.printf("\n\033[0;32mLucro: R$ %.2f", calculo_lucro);
        System.out.printf("\n\033[0;33mDiferença: R$ %.2f\n\033[0;34m*Diferença mínima permitida: R$ 200*", calculo_lucro - (valor_combustivel + pagamento_caminhoneiro));

        System.out.println("\n========================================");

        /* frete valeu a pena?
        Lucro precisa ser R$ 200 maior que os gastos para ser */
        if ((calculo_lucro - (valor_combustivel + pagamento_caminhoneiro)) >= 200){
            System.out.println("\n\033[0;32mVale a pena! Lucro maior que os gastos!\n");
        }else{
            System.out.println("\n\033[0;31mNão vale a pena! Lucro menor que os gastos!\n");
        }

   }
}

/* 3 - crie um programa em java que receba a distancia que sera percorrida por um caminhoneiro
e o tempo gasto pelo valor do diesel  calcule quanto tempo sera gasto para realizar o frete
e o valor gasto em combustilvel, depois diga se o frete vai valer a pena
ou se não vai valer ou se os gastos serão iguas aos lucros, apresente essas informções ao usuário
média de consumo sera igual = 4/km por L.
O caminhoneiro so podera dirigir por 8 horas*/