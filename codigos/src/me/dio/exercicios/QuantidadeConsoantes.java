package me.dio.exercicios;

import java.util.Scanner;

public class QuantidadeConsoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] vetorConsoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.print("Digite uma letra: ");
            String letra = input.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                vetorConsoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;
        } while (count < vetorConsoantes.length);

        System.out.printf("O número de consoantes digitadas é %d: ", quantidadeConsoantes);
        for (String consoante : vetorConsoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
    }
}
