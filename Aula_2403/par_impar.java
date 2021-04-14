package Aula_2403;

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        int num1,res;
        Scanner ent = new Scanner(System.in);
        System.out.println("========= Par ou Impar =========");
        System.out.print("Digite o número: ");
        num1 = ent.nextInt();

        res = num1 % 2;
        System.out.println("--------------------------------");
        if (res == 0) {
            System.out.println("O número "+num1+" é par");
        } else {
            System.out.println("O número "+num1+" é impar");
        }
        ent.close();
    }
}
