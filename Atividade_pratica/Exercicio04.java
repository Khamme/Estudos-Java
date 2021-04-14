package Atividade_pratica;

import java.util.Scanner;

/*
4.	João recebeu seu salário de R$ 1200,00 e precisa pagar duas contas (C1=R$ 200,00 e C2=R$120,00) que estão atrasadas. Como as contas estão atrasadas, João terá de pagar multa de 2% sobre cada conta. Faça um algoritmo que calcule e mostre quanto restará do salário do João 
*/
public class Exercicio04 {
    public static void main(String[] args) {
        double c1, c1_multa, c2, c2_multa, total_contas, salario, sal_rest;
        Scanner ent = new Scanner(System.in);

        System.out.println("==================== Calculo de Salário ====================");
        
        System.out.print("Digite seu salário: ");
        salario = ent.nextDouble();
        System.out.print("Digite o valor da primeira conta: ");
        c1 = ent.nextDouble();
        System.out.print("Digite o valor da segunda conta: ");
        c2 = ent.nextDouble();

        c1_multa = c1 + (c1 * 0.02);
        c2_multa = c2 + (c2 * 0.02);
        total_contas = c1_multa + c2_multa;
        sal_rest = salario - total_contas;

        System.out.println("------------------------------------------------------------");

        System.out.println("Seu salário: R$ "+salario);
        System.out.println("Total da primeira conta com multa de 2% é R$ "+c1_multa);
        System.out.println("Total da segunda conta com multa de 2% é R$ "+c2_multa);
        System.out.println("Valor total das contas: R$ "+total_contas);
        System.out.println("Salário liquido: R$ "+sal_rest);

        System.out.println("============================================================");
        ent.close();
    }
}
