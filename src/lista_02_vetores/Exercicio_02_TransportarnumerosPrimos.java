package lista_02_vetores;

import java.util.Random;

public class Exercicio_02_TransportarnumerosPrimos {

    public static void main(String[] args) {

        int[] vetor = new int[21];
        int[] vetorPrimo = new int[vetor.length];
        int pos = 0;
        int totalDivisores = 0;

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = i;

            for (int j = 2; j < vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    totalDivisores++;
                    if (totalDivisores == 2) {
                        pos++;
                        vetorPrimo[pos] = vetor[i];
                        break;
                    }
                }
            }
        }

        System.out.println("Elementos do vetor: ");
        for (int i = 1; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println("");

        System.out.println("Vetor com elementos primos transportados");
        for (int i = 0; i < pos; i++) {
            System.out.printf("%d ", vetorPrimo[i]);
        }
        System.out.println("");
    }

}
