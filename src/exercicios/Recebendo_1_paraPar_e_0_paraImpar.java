package exercicios;

import java.util.Random;

public class Recebendo_1_paraPar_e_0_paraImpar {

    public static void main(String[] args) {

        Random valores = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = valores.nextInt(20) + 1;
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;//
        }
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }
        
        System.out.println("");
        for (int valor : vetorB) {
            System.out.print(valor + " ");
        }
        System.out.println("");

    }

}
