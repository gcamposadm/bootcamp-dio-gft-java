package me.dio.exercicios;

import java.util.Scanner;

public class MaiorNumeroEMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float numero;
        int ordemDoNumero = 1;
        float soma = 0;
        float maiorNumero = -999999999;
        float count = 0;

        do {
            System.out.printf("Digite o %sº número: ", ordemDoNumero);
            numero = input.nextFloat();
            ordemDoNumero = ordemDoNumero + 1;

            soma = soma + numero;

            if (numero > maiorNumero) maiorNumero = numero;

            count = count + 1;
        } while (count < 5);

        float media = soma / 5F;
        System.out.printf("O maior número é %.2f e a média é %.2f", maiorNumero, media);
    }
}
