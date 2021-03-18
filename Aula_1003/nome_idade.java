package Aula_1003;

import java.util.Scanner;

public class nome_idade {
    public static void main(String[] args) {
        String nome1, nome2;
        int idade1, idade2, media;

        Scanner ent = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.print("Digite o nome da primeira pessoa: ");
        nome1=ent.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        nome2=ent.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        idade1=ent.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        idade2=ent.nextInt();

        media=(idade1+idade2)/2;
        
        System.out.println("No nome da primeira pessoa é: "+nome1+" e a idade é: "+idade1);
        System.out.println("No nome da segunda pessoa é: "+nome2+" e a idade é: "+idade2);
        System.out.println("A média das idades é: "+media);

        ent.close();
    }
}
