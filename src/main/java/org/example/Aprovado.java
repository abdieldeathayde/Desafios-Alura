package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;


public class Aprovado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ArrayList<Double> notas = new ArrayList<Double>();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite três notas:");

        Double media;
        media = 0.0;
        Double nota1 = leitura.nextDouble();
        Double nota2 = leitura.nextDouble();
        Double nota3 = leitura.nextDouble();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        for (Double nota : notas) {
            media += nota;


        }

        media = media / notas.size();

        if (media >= 7.0) {
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media > 5.0 && media <= 6.9) {
            System.out.println("O estudante teve média " + media + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e foi reprovado.");
        }

        System.out.println("Média: " + media);

    }

}
