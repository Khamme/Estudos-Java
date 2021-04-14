package Lista_de_exercicios01;

import java.util.Scanner;

//Elabore um algoritmo que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.

public class ex05 {
    public static void main(String[] args) {
        int c, n, hora_normais;
        double sal, sal_total, e;
        Scanner ent = new Scanner(System.in);

        System.out.println("================================ Calculo de Salário ================================");
        
        System.out.print("Digite seu código: ");
        c = ent.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        n = ent.nextInt();

        System.out.println("------------------------------------------------------------------------------------");
        
        if (n>50) {
            hora_normais = 50;

            sal = hora_normais * 10;
            e = (n - 50) * 20;
            sal_total = sal + e;
            
            System.out.println("Seu salário total será de R$"+sal_total);
            System.out.println("Seu salário excedente será de R$"+e);
            
        } else {
            sal = n * 10;
            e = 0;
            sal_total = sal + e;

            System.out.println("Seu salário total será de R$"+sal_total);
            System.out.println("Como não ocorreu trabalho em hora extra seu salário excedente será de R$"+e);
        }

        System.out.println("====================================================================================");
        System.out.print(c);
        ent.close();
    }
}
