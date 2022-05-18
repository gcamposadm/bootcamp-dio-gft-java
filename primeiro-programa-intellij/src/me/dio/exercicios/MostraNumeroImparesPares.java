package me.dio.exercicios;

import java.util.Scanner;

public class MostraNumeroImparesPares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidadeNumeros, numero;
        int countImpar = 0, countPar = 0;

        String numeroImpar = ("número ímpar");
        String numeroPar = ("número par");
        String numerosImpares = ("números ímpares");
        String numerosPares = ("números pares");

        System.out.println("Quantos números você deseja digitar? ");
        quantidadeNumeros = input.nextInt();

        do {
            System.out.println("Digite um número inteiro: ");
            numero = input.nextInt();
            quantidadeNumeros = quantidadeNumeros - 1;

            if (numero % 2 == 0) {
                countPar = countPar + 1;
            } else countImpar = countImpar + 1;

        } while (quantidadeNumeros > 0);

        if ((countImpar > 1 && countPar > 1) || (countImpar == 0) || (countPar == 0)) {
            System.out.printf("Você digitou %d %s e %d %s", countImpar, numerosImpares, countPar, numerosPares);
        } else if (countImpar > 1 && countPar == 1) {
            System.out.printf("Você digitou %d %s e %d %s", countImpar, numerosImpares, countPar, numeroPar);
        } else if (countImpar == 1 && countPar > 1) {
            System.out.printf("Você digitou %d %s e %d %s", countImpar, numeroImpar, countPar, numerosPares);
        } else if (countImpar == 1 && countPar == 1) {
            System.out.printf("Você digitou %d %s e %d %s", countImpar, numeroImpar, countPar, numeroPar);
        }
    }
}