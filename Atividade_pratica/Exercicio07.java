package Atividade_pratica;

import java.util.Scanner;

/*
7.	Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento:
1 À vista em dinheiro ou cheque, recebe 10% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
Obs.: Caso o usuário informe um código que não esteja na lista acima, o algoritmo deve produzir uma mensagem de código inválido.
*/
public class Exercicio07 {
    public static void main(String[] args) {
        double preco, preco_total, parcela;
        int form_pagamento;
        Scanner ent = new Scanner(System.in);

        System.out.println("============================== Forma de Pagamento ==============================");
        
        System.out.print("Insira o valor da entiqueta: ");
        preco = ent.nextFloat();
        System.out.print("Insira a forma de pagamento: ");
        form_pagamento = ent.nextInt();

        System.out.println("--------------------------------------------------------------------------------");

        if(form_pagamento == 1){
            preco_total = preco - (preco*0.10);

            System.out.println("Código 1 - À vista em dinheiro ou cheque, recebe 10% de desconto.");
            System.out.println("Desconto de 10%");
            System.out.println("Valor total a ser pago: R$"+preco_total);

        }else if(form_pagamento == 2){
            preco_total = preco - (preco*0.15);

            System.out.println("Código 2 - À vista no cartão de crédito, recebe 15% de desconto.");
            System.out.println("Desconto de 15%");
            System.out.println("Valor total a ser pago: R$"+preco_total);

        }else if(form_pagamento == 3){
            parcela = preco/2;
            preco_total = preco;

            System.out.println("Código 3 - Em duas vezes, preço normal de etiqueta sem juros.");
            System.out.println("Não há desconto. Valor da parcela: R$"+parcela);
            System.out.println("Valor total a ser pago: R$"+preco_total);

        }else if(form_pagamento == 4){
            preco_total = preco + (preco*0.10);
            parcela = preco_total/2;

            System.out.println("Código 4 - Em duas vezes, preço normal de etiqueta mais juros de 10%.");
            System.out.println("Juros de 10%. Valor da parcela: R$"+parcela);
            System.out.println("Valor total a ser pago: R$"+preco_total);

        }else{
            System.out.println("[ERRO] Código inválido! Tenta novamente ");
        }

        System.out.println("================================================================================");

        ent.close();
    }
}
