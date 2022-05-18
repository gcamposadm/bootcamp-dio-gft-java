package me.dio.exercicios;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorNumerosAleatorios = new int[20];
        int[] vetorSucessores = new int[20];

        System.out.print("Os números aleatórios são: ");

        for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            int sucessor = numero + 1;
            vetorSucessores[i] = sucessor;

            System.out.print(numero + " ");
        }

        System.out.print("\nE seus sucessores são: ");
        for (int sucessor : vetorSucessores) {
            System.out.print(sucessor + " ");
        }
    }
}
