package Aula_2403;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        int a1, a2, a3, media;
        Scanner ent = new Scanner(System.in);

        System.out.print("Isira a nota da A1: ");
        a1 = ent.nextInt();
        System.out.print("Insira a nota da A2: ");
        a2 = ent.nextInt();

        media = a1 + a2;
        if (media > 5) {
            System.out.print("Aluno aprovado, com a nota: "+media);

        } else {
            System.out.println("Aluno não alcançou a média, é necessário fazer a A3");
            System.out.print("Insira a nota da A3: ");
            a3 = ent.nextInt();
            
            if(a1>a2){
                media = a1 + a3;   

            }else{
                media = a2 + a3;
            }
            
            if (media > 5) {
                System.out.print("Aluno aprovado, com a nota: "+media);

            }else {
                System.out.print("Aluno reprovado");

             }
        }
    ent.close();
    }
}
