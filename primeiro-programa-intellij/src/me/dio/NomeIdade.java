package me.dio;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome;

        while (true) {
            System.out.println("Digite o seu nome: ");
            nome = teclado.next();
            if (nome.equals("0")) break;

            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();
        }
    }
}
