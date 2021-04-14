package Aula_2403;

import java.util.Scanner;

/*
O usuário informa 3 números. O programa deve identificar se esses números são iguais ou diferentes. No caso, dos números diferentes, o código deve informar, qual é o maior, qual é o menor e qual número está nesse intervalo
*/
public class ex003 {
    public static void main(String[] args) {
        double n1,n2,n3;
        Scanner ent = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        n1 = ent.nextDouble();
        System.out.print("Informe o segundo número: ");
        n2 = ent.nextDouble();
        System.out.print("Informe o terceiro número: ");
        n3 = ent.nextDouble();

        if ((n1 == n2) && (n1 == n3)) {
            System.out.println("Todos os números são iguais");
        }else if (((n1 == n2) && (n1 != n3)) || ((n1 != n2) && (n1 == n3))) {
            System.out.println("[ERRO] Insira outros números!");

        }else if((n1 > n2) && (n1 > n3) && (n2 > n3)){
            System.out.println("O maior número é o "+n1+" o número do meio é o "+n2+" e o menor número é o "+n3);

        }else if((n2 > n1) && (n2 > n3) && (n1 > n3)){
            System.out.println("O maior número é o "+n2+" o número do meio é o "+n1+" e o menor número é o "+n3);

        }else if((n3 > n1) && (n3 > n2) && (n2 > n1)){
            System.out.println("O maior número é o "+n3+" o número do meio é o "+n2+" e o menor número é o "+n1);

        }else if((n1 > n2) && (n1 > n3) && (n3 > n2)){
            System.out.println("O maior número é o "+n1+" o número do meio é o "+n3+" e o menor número é o "+n2);

        }else if((n2 > n1) && (n2 > n3) && (n3 > n1)){
            System.out.println("O maior número é o "+n2+" o número do meio é o "+n3+" e o menor número é o "+n1);

        }else if((n3 > n1) && (n3 > n2) && (n1 > n2)){
            System.out.println("O maior número é o "+n3+" o número do meio é o "+n1+" e o menor número é o "+n2);
        }
        ent.close();
    }
}
