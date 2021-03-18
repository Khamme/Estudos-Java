package Aula_1003;
import java.util.Scanner;

public class media_aritmetica {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;

        Scanner ent = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.print("Digite a primeira nota: ");
        nota1=ent.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2=ent.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3=ent.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4=ent.nextDouble();

        media=(nota1+nota2+nota3+nota4)/4;
        System.out.println("-----------------------------");
        System.out.println("Primeira nota: "+nota1);
        System.out.println("Segunda  nota: "+nota2);
        System.out.println("Terceira nota: "+nota3);
        System.out.println("Quarta   nota: "+nota4);
        System.out.println("A média das notas é: "+media);
        ent.close();
    }
}
