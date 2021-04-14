package Atividade_pratica;

import java.util.Scanner;

/*
2.	A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou. Segue abaixo o exemplo da execução.   
*/
public class Exercicio02 {
    public static void main(String[] args) {
        int latas, garrafaP, garrafaG;
        double l_latas, l_garrafaP, l_garrafaG, total;
        Scanner ent = new Scanner(System.in);

        System.out.println("=========================================================== Sistema Meia-Cola ===========================================================");
        
        System.out.print("Digite a quantidade de latas compradas: ");
        latas = ent.nextInt();
        System.out.print("Digite a quantidade de garrafas de 600ml compradas: ");
        garrafaP = ent.nextInt();
        System.out.print("Digite a quantidade de garrafas de 2L compradas: ");
        garrafaG = ent.nextInt();

        l_latas = latas * 0.35;
        l_garrafaP = garrafaP * 0.6;
        l_garrafaG = garrafaG * 2;
        total = l_latas + l_garrafaP + l_garrafaG;

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Foram compradas "+ latas + " latas de 350ml, portanto foram comprados "+ l_latas +" litros de refrigerante nesse formato.");
        System.out.println("Foram compradas "+ garrafaP + " garrafas de 600ml, portanto foram comprados "+ l_garrafaP +" litros de refrigerante nesse formato.");
        System.out.println("Foram compradas "+ garrafaG + " garrafas de 2L, portanto foram comprados "+ l_garrafaG +" litros de refrigerante nesse formato.");
        System.out.println("Foram compradas "+ total + " de litros de refrigerante no total.");

        System.out.println("=========================================================================================================================================");

        ent.close();
    }
}
