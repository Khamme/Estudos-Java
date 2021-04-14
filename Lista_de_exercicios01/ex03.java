package Lista_de_exercicios01;

import java.util.Scanner;

//Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.

public class ex03 {
    public static void main(String[] args) {
        double n1,n2,n3, media1, media2;
        Scanner ent = new Scanner(System.in);
    
        System.out.println("===== Média Ponderada =====");
        
        System.out.print("Insira a primeira nota: ");
        n1 = ent.nextDouble();
        System.out.print("Insira a segunda nota:  ");
        n2 = ent.nextDouble();
        System.out.print("Insira a terceira nota: ");
        n3 = ent.nextDouble();

        media1 = ((n1*2)+(n2*3)+(n3*5))/10;
        media2=((n1*20/100)+(n2*30/100)+(n3*50/100));

        System.out.println("---------------------------");

        System.out.println("A primeira nota é:   "+n1);
        System.out.println("A segunda nota é:    "+n2);
        System.out.println("A terceira nota é:   "+n3);
        System.out.println("---------------------------");
        System.out.println("A média ponderada é: "+media1);
        System.out.println("A média ponderada é: "+media2);

        System.out.println("===========================");
        ent.close();
    }
}
