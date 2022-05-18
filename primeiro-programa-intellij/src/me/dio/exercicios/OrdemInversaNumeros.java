package me.dio.exercicios;

public class OrdemInversaNumeros {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5};

        System.out.print("Vetor: ");

        int tamanhoVetor = vetor.length;

        int posicaoVetor = tamanhoVetor - 1;
        while (posicaoVetor >= 0) {
            System.out.print(vetor[posicaoVetor] + " ");
            posicaoVetor--;
        }
    }
}
