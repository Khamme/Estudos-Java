package Atividade_pratica;
/*
1.	A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados. Segue abaixo o exemplo da execução.
*/
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int paes, broas;
        double tpaes, tbroas, total, polpanca;
        Scanner ent = new Scanner(System.in);

        System.out.println("============= Padaria Hotpão =============");
        
        System.out.print("Digite a quantidade de pães vendidos:  ");
        paes = ent.nextInt();
        System.out.print("Digite a quantidade de broas vendidas: ");
        broas = ent.nextInt();
        
        tpaes =  paes * 0.12;
        tbroas = broas * 1.50;
        total = tpaes + tbroas;
        polpanca = total * 0.10;

        System.out.println("------------------------------------------");

        System.out.println("Total de venda de pães:  "+tpaes);
        System.out.println("Total de venda de broas: "+tbroas);
        System.out.println("Total de vendas:         "+total);
        System.out.println("Valor para polpança:     "+polpanca);

        System.out.println("==========================================");
        ent.close();

    }
}
