package Lista_de_exercicios01;
/*
Dados três valores A, B, C verificar se eles podem ser o comprimento dos lados de um triângulo, se forem, verificar se compõem um triângulo equilátero, isósceles ou escaleno. Informar se não formam nenhum triângulo.
Dados de entrada: três lados de um suposto triângulo (A,B,C).
Dados de saída: -  mensagens: não compõem um triângulo, triângulo Equilátero, triângulo isósceles , triangulo escaleno.
Um triângulo é uma figura geométrica fechada de três lados, em que cada um é menor que a 
soma dos outros dois.
Triângulo equilátero: possui três lados iguais.
Triângulo isósceles: possui dois lados iguais.
Triângulo escaleno: possui todos os lados diferentes.
*/

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner ent = new Scanner(System.in);

        System.out.println("========== Sistema de Triângulos ==========");
        
        System.out.print("Insira o valor A: ");
        a = ent.nextInt();
        System.out.print("Insira o valor B: ");
        b = ent.nextInt();
        System.out.print("Insira o valor C: ");
        c = ent.nextInt();

        System.out.println("-------------------------------------------");

        if((a + b > c) && ( a + c > b) && (b + c > a)){
            if((a != b) && (b != c) && (a != c)){

                System.out.println("Compõe um triângulo escaleno");

            }else if((a == b) && (b == c) && (c == a)){
                
                System.out.println("Compõe um triângulo equilátero");

            }else {

                System.out.println("Compõe um triângulo isósceles");
            }
        }else{

            System.out.println("Não compõe um triângulo");
        }
        System.out.println("===========================================");
        ent.close();
    }
}
