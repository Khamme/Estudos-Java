package Aula_1703;
import java.util.Scanner;

public class ex001 {
    public static void main(String [] args){
        String nome;
        int anon, anoa, idade;
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        nome=ent.nextLine();

        System.out.print("Digite o ano em que você nasceu:");
        anon = ent.nextInt();

        System.out.print("Digite o ano atual:");
        anoa = ent.nextInt();

        idade = anoa - anon;

        if(idade >= 18){
            System.out.println("Seu nome é "+nome+" você pode dirigir");
        }else{
            System.out.println("Seu nome é "+nome+" você não pode dirigir");
        }

        ent.close();
    }
}