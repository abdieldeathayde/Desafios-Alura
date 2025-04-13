package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        numeros.add(numero1);
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        numeros.add(numero2);
        int maior = -1;

        for (Integer numero: numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior numéro é " + maior);

    }
}
