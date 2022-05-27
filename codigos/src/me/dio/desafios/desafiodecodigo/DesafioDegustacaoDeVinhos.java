package me.dio.desafios.desafiodecodigo;

import java.util.Scanner;

public class DesafioDegustacaoDeVinhos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.print("Digite o tipo de vinho: ");
        String T = scan.nextLine();

        //System.out.print("Digite a resposta dos competidores: ");
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;
        for (String resposta : respostasCompetidoresSplit) {
            if (resposta.equals(T)) {
                count++;
            }
        }
        //System.out.print("O número de respostas corretas é: ");
        System.out.print(count);
    }
}

