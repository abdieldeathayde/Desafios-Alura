package org.example;

public class Principal {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 1890.0;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor de irrf: " + irrf);
        } else if (isento) {
            System.out.println("Contribuinte isento de irrf");
        } else {
            System.out.println("Não há valores de irrf.");
        }
    }
}