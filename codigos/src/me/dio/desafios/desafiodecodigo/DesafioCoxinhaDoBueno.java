package me.dio.desafios.desafiodecodigo;

import java.util.Scanner;

public class DesafioCoxinhaDoBueno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.print("Digite,respectivamente, o número de coxinhas consumidas e o número de participantes: ");
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");
        String H = inputSplit[0];
        String P = inputSplit[1];

        double media = Double.parseDouble(H) / Double.parseDouble(P);

        System.out.printf("%.2f", media);
    }
}

