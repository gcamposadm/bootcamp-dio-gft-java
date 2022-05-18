package me.dio.exercicios;

import java.util.Scanner;

public class NumeroEntreZeroDez {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma nota entre zero e dez: ");
        float nota = teclado.nextFloat();

        while (nota <= 0 || nota >= 10) {
            System.out.println("Valor inválido! \n");
            System.out.println("Digite novamente: ");
            nota = teclado.nextFloat();
        }
    }
}


