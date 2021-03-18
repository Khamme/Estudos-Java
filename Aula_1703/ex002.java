package Aula_1703;

import java.util.Scanner;

public class ex002 {
    /*
    Escreva um programa que o usuário informa seu nome, seu ano de nascimento e o ano atual. O programa deve calcular a idade do usuário e informar se ele já pode se aposentar. Sabendo que para se aposentar é necessário ter 65 anos. Além disso, se o usuário não puder se aposentar ainda o programa devee informar quantos anos faltam para a sua aposentadoria
    */
    public static void main(String[] args) {
        int ano_nasc, ano_atual, idade, anos_falta;
        String nome;
        Scanner ent = new Scanner(System.in);

        System.out.println("====================================================================================");
        System.out.print("Digite seu nome:");
        nome = ent.nextLine();

        System.out.print("Digite em que ano nasceu: ");
        ano_nasc = ent.nextInt();

        System.out.print("Digite o ano atual: ");
        ano_atual = ent.nextInt();

        idade = ano_atual - ano_nasc;
        if(idade >=65){
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Seu nome é "+nome+" você tem "+idade+" anos e pode se aposentar");
        }else{
            anos_falta = 65 - idade;
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Seu nome é "+nome+" você tem "+idade+" anos e não pode se aposentar");
            System.out.println("Faltam "+anos_falta+" anos para se posentar!");
        }
        System.out.println("====================================================================================");
        ent.close();
    }
}
