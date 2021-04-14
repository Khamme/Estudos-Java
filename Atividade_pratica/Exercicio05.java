package Atividade_pratica;

import java.util.Scanner;

/*
5.	Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
*/
public class Exercicio05 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner ent = new Scanner(System.in);

        System.out.println("================== Sistema de Soma/Multiplicação ==================");
        
        System.out.print("Insira o valor de A: ");
        a = ent.nextInt();
        System.out.print("Insira o valor de B: ");
        b = ent.nextInt();

        System.out.println("-------------------------------------------------------------------");

        if(a == b){
            c = a + b;
            System.out.println("Os números são iguais, o valor da soma é: "+c);
        }else{
            c = a * b;
            System.out.println("Os números são difenrentes, o valor da multiplicação é: "+c);
        }
        System.out.println("===================================================================");

        ent.close();
    }
}
