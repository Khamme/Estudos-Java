package Aula_1703;

import java.util.Scanner;

/*
    Escreva um programa que o usuário informa a altura e a base do retângulo. O progrma deve calcular a área do retângulo. A saber, que a área é a base * a altura. E o programa deve identificar se as dimentsões informadas formam um retângulo ou um quadrado. A saber, um quadrado tem lados iguais
    */
public class ex003 {
    public static void main(String[] args) {
        int altura, base, area;
        Scanner ent = new Scanner(System.in);

        System.out.print("Insira a base: ");
        base = ent.nextInt();
        System.out.print("Insira a altura: ");
        altura = ent.nextInt();

        area = base * altura;

        if (base == altura) {
            System.out.println("A figura é um quadrado! E sua área é de "+area);
        }else{
            System.out.println("A figura é um retângulo! Sua área é de "+area);
        }
        ent.close();
    }
}
