package lista_02_vetores;

import java.util.Random;

public class Exercicio_02_TransportarnumerosPrimos {

    public static void main(String[] args) {
        Random valor = new Random();

        int[] vetor = new int[10];
        int[] vetorPrimo = new int[vetor.length];
        int i;
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = valor.nextInt(100) + 1;
            System.out.println("Posição["+i+"] -> " +  vetor[i]);
        }
        boolean ePrimo = true;
        double limite = Math.sqrt(vetor[i]);
         int j= 2;
        while (j <=limite && ePrimo){
            if (vetor[i] % j == 0) {
             ePrimo = false;   
            }
            j++;
        }
        if (ePrimo) {
            for (int k = 0; k < vetor.length; k++) {
                System.out.print(vetor[i] + " ");
            }
            
           // System.out.println(vetor[i] + " é primo");
        }else {
            //System.out.println(numero + " não é primo");
            
        }

    }
}
