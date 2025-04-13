package org.example;

import java.util.Scanner;

public class DescontoCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorCompra;
        int desconto = 10;
        double valorComDesconto = 0;
        System.out.print("Insira o valor da compra: ");
        valorCompra = sc.nextInt();

        if (valorCompra >= 100) {
            valorComDesconto = valorCompra - valorCompra * 0.1;
            System.out.println("Desconto de " + desconto + "% aplicado.");
            System.out.println("Novo valor: R$ " + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado");
            System.out.println("Valor total: R$ " + valorCompra);
        }
        sc.close();
    }

}
