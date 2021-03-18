package Aula_1703;

import java.util.Scanner;

/*
Escreva um programa que o usuário informa dois númeors quaisquer e informa qual é o maior número qual é o menor número
*/
public class ex004 {
    public static void main(String[] args) {
        int n1, n2, n_maior, n_menor, quad_maior, quad_menor;
        Scanner ent = new Scanner(System.in);
        System.out.println("================== Comparação de Códigos ==================");
        System.out.print("Informe o primeiro número: ");
        n1 = ent.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = ent.nextInt();
        System.out.println("-----------------------------------------------------------");
        if(n1>n2){
           // System.out.println("O número "+n1+" é maior que o número "+n2);
            n_maior=n1;
            n_menor=n2;
            System.out.println("O número maior é o "+n_maior);
            System.out.println("O número menor é o "+n_menor);

        } else{
           // System.out.println("O número "+n2+" é maior que o número "+n1);
            n_maior=n2;
            n_menor=n1;
            System.out.println("O número maior é o "+n_maior);
            System.out.println("O número menor é o "+n_menor);
        }
        System.out.println("-----------------------------------------------------------");
        
        quad_maior= n_maior*n_maior;
        quad_menor = n_menor*n_menor;

        System.out.println("O quadrado do maior número é "+quad_maior);
        System.out.println("O quadrado do menor número é "+quad_menor);
        ent.close();
        System.out.println("===========================================================");
    }
    
}
