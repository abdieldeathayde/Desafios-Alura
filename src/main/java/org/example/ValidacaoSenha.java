package org.example;

import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha;
        int senhaCorreta = 123456;

        System.out.print("Digite sua senha: ");
        senha = sc.nextInt();

        if (senha == senhaCorreta) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
