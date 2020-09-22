package exercicios_casos_de_estudos;

import java.util.Scanner;

public class VetoresRecebendo_Impares_E_pares {
    
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        
        int[]vetorA = new int [20];
        int[]vetorB = new int[vetorA.length];
        int[]vetorC = new int [vetorA.length];
        
        int posB = 0;
        int posC = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor do vetor A --> " );
            vetorA[i] = imput.nextInt();            
        }
        
         for (int i = 0; i < vetorA.length; i++) {
             if (vetorA[i] % 2 == 0) {
                 vetorB[posB] = vetorA[i];
                 posB++;
             }else {
                 vetorC[posC] = vetorA[i];
                 posC++;
             }             
         }
         System.out.println("Vetor A");
          for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
          System.out.println("");
          System.out.println("Vetor B");
          for (int i = 0; i < posB; i++) {
            System.out.print(vetorB[i] + " ");
        } 
          System.out.println("");
          System.out.println("Vetor C");
          for (int i = 0; i < posC; i++) {
            System.out.print(vetorC[i] + " ");
        }
         
    }
    
}
