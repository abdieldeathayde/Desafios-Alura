package org.example;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        System.out.print("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        String continuar;

        do {


            int numero = leitura.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else if (numero % 2 != 0) {
                System.out.println("O número " + numero + " é ímpar.");
            }

        System.out.print("Deseja testar outro número? (s/n): ");


        continuar = leitura.next();
        System.out.print("\nDigite outro número: ");
        } while (continuar.equalsIgnoreCase("s"));

        leitura.close();
    }

}
