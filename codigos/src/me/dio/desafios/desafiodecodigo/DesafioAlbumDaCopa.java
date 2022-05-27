package me.dio.desafios.desafiodecodigo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DesafioAlbumDaCopa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.print("Digite o número de espaços no álbum: ");
        int numTotal = scan.nextInt();

        //System.out.print("Digite o número de figurinhas compradas: ");
        int numFigCompradas = scan.nextInt();

        Set<Integer> setFig = new HashSet<>();

        for (int i = 0; i < numFigCompradas; i++) {
            //System.out.print("Digite o número da Figurinha: ");
            setFig.add(scan.nextInt());
        }
        System.out.println(numTotal - setFig.size());
    }
}