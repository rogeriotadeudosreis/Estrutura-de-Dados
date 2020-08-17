package lista_01_vetores;

import java.util.Random;

public class Exercicio_02_MegaSena {

    public static void main(String[] args) {

        Random numero = new Random();
        int sorteado = 0;
        int jogo[] = new int[6];

        for (int i = 0; i < jogo.length; i++) {
            sorteado = numero.nextInt(5) + 1;
            boolean repete = false;
            
            for (int j = 0; j < jogo.length; j++) {
                if (jogo[j] == sorteado) {
                    repete = true;
                    break;
                }else {
                    repete = false;
                }
            }
            if (!repete) {
                jogo[i] = sorteado;
            }else{
                i--;
            }
        }
        //ordenando os valores do vetor 
        int temp;
        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo.length; j++) {
                if (jogo[i] < jogo[j]) {
                 temp = jogo[i];
                 jogo[i] = jogo[j];
                 jogo[j] = temp;
                }
            }
        }
        
        System.out.print("Números sorteados: ");
        imprimeVetor(jogo);
    }
    //método imprime vetor
    public static void imprimeVetor(int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println("");
           
    }

}
