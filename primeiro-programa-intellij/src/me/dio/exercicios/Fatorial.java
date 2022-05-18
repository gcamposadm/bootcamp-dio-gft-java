package me.dio.exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int multiplicacao = numero;

        for (int i = numero; i > 1; i--) {
            multiplicacao = multiplicacao * (i - 1);
        }

        System.out.printf("%d! = %d", numero, multiplicacao);
    }
}

