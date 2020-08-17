package exercicios;

import java.util.Random;

public class JogoDeDados {
    
    public static void main(String[] args) {
        
        Random numero = new Random();//gerador de números aleatórios
        int[] frequencia = new int [7];// array de contador de frequencia
        
        //lança os dados 6000 vezes; utiliza o valor do dado como índice de frequencia
        for (int lancamento = 1; lancamento <= 1000; lancamento++) {
            frequencia[numero.nextInt(6) + 1]++;
        }
        
        // gera saída do valor de cada elemento do array
            System.out.printf("%s%11s\n", "Lado", "Frequencia");            
        for (int lado = 1; lado < frequencia.length; lado++) {
            System.out.printf("%4d%11d\n", lado, frequencia[lado]);
        }
        
    }
    
}
