package parte_1_exercicios_metodosdeordenacao_2020_2;

import java.util.Random;

public class Exercicio_2_Mediana_Bolha {

    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int [8];
        int valor = 0;
        
        for (int i = 0; i < vetor.length; i++) {
        valor = random.nextInt(50) + 1;
            vetor[i] = valor;
        }
        int aux;
        
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor [j +1];
                    vetor [j+1] = aux;
                }
            }
        }
        float mediana;
        if (vetor.length % 2 == 0) {
            mediana = (float)(vetor[(vetor.length - 1) / 2] + vetor [vetor.length / 2]) / 2;
            System.out.print("Vetor par: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(" " + vetor[i] + " ");
            }
            System.out.println("\nMediana: " + mediana);
        }else {
            mediana = vetor[(vetor.length - 1) / 2];
            System.out.print("Vetor Impar: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(" " + vetor [i] + " ");
            }
            System.out.println("\nMediana: " + mediana);            
        }

    }

}
