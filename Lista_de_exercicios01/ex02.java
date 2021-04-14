package Lista_de_exercicios01;

import java.util.Scanner;

//Escreva um programa que peça ao usuário o nome e a idade de duas pessoas e mostre na tela os nomes e as idades informados e a média das idades informadas.


public class ex02 {
    public static void main(String[] args) {
        int idade1, idade2;
        double media;
        String nome1;
        String n2;
        Scanner ent = new Scanner(System.in);

        System.out.println("======================= Media de Idades =======================");
        
        System.out.print("Insira o primeiro nome: ");
        nome1 = ent.nextLine();
        System.out.print("Insira o segundo nome: ");
        n2 = ent.nextLine();

        System.out.print("Insira a primeira idade: ");
        idade1 = ent.nextInt();
        System.out.print("Insira a segunda idade: ");
        idade2 = ent.nextInt();

        System.out.println(" ");
        media = (idade1+idade2)/2;

        System.out.println("O nome da primeira pessoa é "+nome1+" e sua idade é "+idade1);
        System.out.println("O nome da segunda pessoa é "+n2+" e sua idade é "+idade2);
        System.out.println("A média das duas idades é "+media);

        System.out.println("=================================================================");
        ent.close();
    }
}
