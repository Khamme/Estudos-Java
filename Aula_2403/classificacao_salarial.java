package Aula_2403;

import java.util.Scanner;

public class classificacao_salarial {
    public static void main(String[] args) {
        /*
        Classificação Salarial
        0 - 2000 = Classe D
        2001 - 4000 = Classe C
        4001 - 6000 = Classe B
        >6000 = Classe A
        */
        double salario;
        String classe, nome;
        Scanner ent = new Scanner(System.in);

        System.out.println("====================== CLASSIFICAÇÃO SALARIAL ======================");
        System.out.print("Digite seu nome: ");
        nome = ent.nextLine();

        System.out.print("Digite seu salário: ");
        salario = ent.nextDouble();
        System.out.println("---------------------------------------------------------------------");
        if ((salario > 0) && (salario <= 2000)) {
            classe = "D";
            System.out.println("Seu nome é "+nome+" seu salárioo é R$"+salario+" e sua classe salarial é "+classe);
        }
        if ((salario>=2001) && (salario<=4000)) {
            classe = "C";
            System.out.println("Seu nome é "+nome+" seu salárioo é R$"+salario+" e sua classe salarial é "+classe);
        }
        if ((salario>=4001) && (salario<=6000)) {
            classe = "B";
            System.out.println("Seu nome é "+nome+" seu salárioo é R$"+salario+" e sua classe salarial é "+classe);
        }
        if (salario>6000) {
            classe = "A";
            System.out.println("Seu nome é "+nome+" seu salárioo é R$"+salario+" e sua classe salarial é "+classe);
        }
        System.out.println("---------------------------------------------------------------------");
        ent.close();
    }
}
