package ExerciciosPrimeiraAula;

import java.util.Random;

public class Exercicio2MegaSena {

    public static void main(String[] args) {
        
        Random numero = new Random();
        int sorteado = 0;
        int jogo[] = new int[6];

        for (int i = 0; i < jogo.length; i++) {
            sorteado = numero.nextInt(60) + 1;
            jogo[i] = sorteado;
        }
        System.out.print("Números sorteados: ");
        
        for (int i = 0; i < jogo.length; i++) {
            
            //criar aqui uma condicional para não
            //repetir os valores
            System.out.printf("%d ", jogo[i]);
        }
        System.out.println("");

    }

}
