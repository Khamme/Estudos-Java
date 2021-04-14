package Atividade_pratica;

import java.util.Scanner;

/*
6.	O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. IMC em adultos Condição:
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso

*/
public class Exercicio06 {
    public static void main(String[] args) {
        double peso, altura , IMC;
        Scanner ent = new Scanner(System.in);

        System.out.println("====================== Calculo de IMC ======================");
        
        System.out.print("Insira sua altura (em metros): ");
        altura = ent.nextDouble();
        System.out.print("Insira seu peso (em quilogramas): ");
        peso = ent.nextDouble();

        IMC = peso / (altura * altura);

        System.out.println("------------------------------------------------------------");

        System.out.print("Seu IMC é: "+IMC+". ");

        if(IMC < 18.5){
            System.out.println("Você está a baixo do peso");

        }else if(IMC < 25){
            System.out.println("Você está com o peso normal");

        }else if(IMC < 30){
            System.out.println("Você está acima do peso");

        }else{
            System.out.println("Você está obeso");
        }
        System.out.println("============================================================");

        ent.close();
    }
}
