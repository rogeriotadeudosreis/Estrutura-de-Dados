package lista_02_vetores;

import java.util.Random;

public class Exercicio_01_NotasDe20Alunos {

    public static void main(String[] args) {

        
        int notas[] = new int[20];//vetor criado para receber as 20 notas
        int frequencia[] = new int[11];//vetor criado para somar a frequencia
        Random valor = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = valor.nextInt(100) + 1;
            frequencia[notas[i] / 10]++;
        }

        System.out.printf("%s%11s\n", "Intervalo", "Frequencia");
        for (int i = 0; i < frequencia.length - 1; i++) {
            System.out.printf("%02d-%02d: %13d\n", i * 10, i * 10 + 9, frequencia[i]);
        }
        System.out.printf("  100: %13d\n ", frequencia[10]);
    }
}
