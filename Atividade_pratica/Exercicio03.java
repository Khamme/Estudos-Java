package Atividade_pratica;

import java.util.Scanner;

/*
3.	Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
a) a idade dessa pessoa em anos; 
b) a idade dessa pessoa em meses; 
c) a idade dessa pessoa em dias; 
d) a idade dessa pessoa em semanas.
e) a idade dessa pessoa em horas.

*/
public class Exercicio03 {
    public static void main(String[] args) {
        int ano_nasc, ano_atual, idade, meses, semanas, dias, horas;
        Scanner ent = new Scanner(System.in);

        System.out.println("============ Calculo de Idade ============");
        
        System.out.print("Digite o ano de nascimento: ");
        ano_nasc = ent.nextInt();
        System.out.print("Digite o ano atual: ");
        ano_atual = ent.nextInt();
        
        idade = ano_atual - ano_nasc;
        meses = idade * 12;
        semanas = (int) (idade * 52.143);
        dias = idade * 365;
        horas = idade * 8760;

        System.out.println("------------------------------------------");

        System.out.println("Você tem "+ idade +" ANOS de idade");
        System.out.println("Você tem "+ meses +" MESES de idade");
        System.out.println("Você tem "+ semanas +" SEMANAS de idade");
        System.out.println("Você tem "+ dias +" DIAS de idade");
        System.out.println("Você tem "+ horas +" HORAS de idade");

        System.out.println("==========================================");

        ent.close();
        
    }
}
