package Lista_de_exercicios01;

import java.util.Scanner;

//Escreva um programa que o usuário informe 4 notas e o programa informe a média do aluno.

public class ex01 {
   public static void main(String[] args) {
       double n1,n2,n3,n4,media;
       Scanner ent = new Scanner(System.in);
       System.out.println(" ");
       System.out.println("===== Sistema de Média =====");

       System.out.print("Insira a primeira nota: ");
       n1 = ent.nextDouble();
       System.out.print("Insira a segunda nota: ");
       n2 = ent.nextDouble();
       System.out.print("Insira a terceira nota: ");
       n3 = ent.nextDouble();
       System.out.print("Insira a quarta nota: ");
       n4 = ent.nextDouble();

       System.out.println("----------------------------");
       
       media = (n1+n2+n3+n4)/4;

       System.out.println("A média do aluno é -> "+media);
       
       System.out.println("============================");

       ent.close();
   }

}
