package Lista_de_exercicios01;

import java.util.Scanner;

/*
8-    Construa um algoritmo que, receba a idade de um nadador, classifique-o em uma das seguintes categorias:

    Infantil A = 5-7 anos
    Infantil B = 8-10 anos
    Juvenil A = 11-13 anos
    Juvenil B = 14-17 anos
    Sênior = maiores de 18 anos
    Idade inferior a 5 anos informar que não existe categoria
    Realizar uma validação que não permite informar idade negativa, neste caso mostrar a mensagem de idade inválida
*/
public class ex08 {
    public static void main(String[] args) {
        int idade;
        Scanner ent = new Scanner(System.in);

        System.out.println("====== Categorização de Nadadores ======");
        
        System.out.print("Insira a idade do nadador: ");
        idade = ent.nextInt();

        System.out.println("----------------------------------------");

        if(idade <= 0){
            System.out.println("Idade inválida");

        } else if(idade >= 5){
            if(idade <= 7){
                System.out.println("Categoria -> Infantil A");

            }else if(idade <=10){
                System.out.println("Categoria -> Infantil B");

            }else if(idade <= 13){
                System.out.println("Categoria -> Juvenil A");

            }else if(idade <= 17){
                System.out.println("Categoria -> Juvenil B");

            }else {
                System.out.println("Categoria -> Sênior");
            }

        } else {
            System.out.println("Não existe categoria para essa idade");
        }

        System.out.println("========================================");
        ent.close();
    }
}
