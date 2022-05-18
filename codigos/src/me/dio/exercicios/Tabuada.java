package me.dio.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da tabuada desejada: ");
        int numero = input.nextInt();

        System.out.printf("A tabuada de %s é:\n", numero);

        for (int i = 1; i <= 10; i++) {
            int multiplicacao = (numero * i);
            System.out.printf("%d X %d = %s\n", numero, i, multiplicacao);
        }
    }
}
