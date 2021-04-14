package Lista_de_exercicios01;

import java.util.Scanner;

/*
6-    Desenvolva um algoritmo que:
•    Leia 4 (quatro) números;
•    Calcule o quadrado de cada um;
•    Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•    Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
public class ex06 {
    public static void main(String[] args) {
        float n1,n2,n3,n4, quad_n1,quad_n2,quad_n3,quad_n4;
        Scanner ent = new Scanner(System.in);

        System.out.println("==================== Calculo de Quadrado ====================");
        
        System.out.print("Insira o primeiro número: ");
        n1 = ent.nextFloat();
        System.out.print("Insira o segundo número: ");
        n2 = ent.nextFloat();
        System.out.print("Insira o terceiro número: ");
        n3 = ent.nextFloat();
        System.out.print("Insira o quarto número: ");
        n4 = ent.nextFloat();
        
        System.out.println("-------------------------------------------------------------");
        
        quad_n1 = n1 * n1;
        quad_n2 = n2 * n2;
        quad_n3 = n3 * n3;
        quad_n4 = n4 * n4;

        if (quad_n3>=1000) {
            System.out.println("O quadrado do terceiro número é: "+quad_n3);
        } else {
            System.out.println("Segue abaixo os números e seus respectivos quadrados"); 
            System.out.println("Primeiro número -> "+n1+" seu quadrado é -> "+quad_n1);
            System.out.println("Primeiro número -> "+n2+" seu quadrado é -> "+quad_n2);
            System.out.println("Primeiro número -> "+n3+" seu quadrado é -> "+quad_n3);
            System.out.println("Primeiro número -> "+n4+" seu quadrado é -> "+quad_n4);
        }
        System.out.println("=============================================================");

        ent.close();
    }
}
