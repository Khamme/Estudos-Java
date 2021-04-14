package Lista_de_exercicios01;

import java.util.Scanner;

//O custo ao consumidor de um carro novo é a soma do custo de fábrica  com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).  Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

public class ex04 {
    public static void main(String[] args) {
        double cfabrica, distribuidor, imposto, ctotal;
        Scanner ent = new Scanner (System.in);
        System.out.println(" ");
        System.out.println("========== Calculo do Custo de um Carro ==========");
        
        System.out.print("Insira o custo de fabrica do carro: ");
        cfabrica = ent.nextInt();

        distribuidor = 0.28*cfabrica ;
        imposto = 0.45*cfabrica;
        ctotal = (cfabrica + distribuidor + imposto);

        System.out.println("--------------------------------------------------");

        System.out.println("O custo ao consumidor irá ser de: R$"+ctotal);

        System.out.println("===================================================");
    ent.close();
    }
}
