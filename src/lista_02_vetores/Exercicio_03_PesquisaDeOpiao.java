package lista_02_vetores;

import java.util.Random;

public class Exercicio_03_PesquisaDeOpiao {

    public static void main(String[] args) {

        Random valor = new Random();

        int[] alunos = new int[20];
        int[] frequencia = new int[6];
        double perc_notas_4 = 0;
        double perc_notas_5 = 0;
        System.out.println("Notas dadas pelos 20 alunos: ");
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = valor.nextInt(5) + 1;
            System.out.print(alunos[i] + " ");
            frequencia[alunos[i]]++;
        }
        System.out.println("");

        for (int i = 1; i < frequencia.length; i++) {
            perc_notas_4 = frequencia[4] / 20.0 * 100;
            perc_notas_5 = frequencia[5] / 20.0 * 100;
            System.out.printf("A quantidade de notas %d: %d %s\n", i, frequencia[i], "aluno(s) deram esta nota");

        }
        System.out.printf("Percentual de notas 4 --> %.1f %%\n", perc_notas_4);
        System.out.printf("Percentual de notas 5 --> %.1f %%\n", perc_notas_5);
    }
}
