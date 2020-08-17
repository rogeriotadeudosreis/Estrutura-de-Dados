package lista_01_vetores;

import java.util.Random;

public class Exercicio_01_MaiorEsegundoMaior {

    public static void main(String[] args) {
        Random elementos = new Random();

        int vetor[];
        vetor = new int[16];
        int maior;
        int segundoMaior;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = elementos.nextInt(500) + 1;
            System.out.print(vetor[i] + " ");
        }

        if (vetor[0] > vetor[1]) {
            maior = vetor[0];
            segundoMaior = vetor[1];

        } else {
            maior = vetor[1];
            segundoMaior = vetor[0];
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                segundoMaior = maior;
                maior = vetor[i];
            } else if (vetor[i] > segundoMaior) {
                segundoMaior = vetor[i];

            }
        }
        
        System.out.println("\nMaior: " + maior);
        System.out.println("Segundo maior: " + segundoMaior);

    }

}
