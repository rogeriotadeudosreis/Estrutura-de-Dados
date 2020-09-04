/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeordenacao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class MetodoDeBuscaBinaria {

    static MetodoDeBuscaBinaria ordenar;

    private MetodoDeBuscaBinaria() {

    }

    public static void main(String[] args) {
        ordenar = new MetodoDeBuscaBinaria();
        Random valor = new Random();

        int tamanho = 7;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valor.nextInt(30) + 1;
        }
        ordenar.ordena_insercao(vetor, tamanho);
        System.out.println("Elementos do vetor de forma ordenada:");
        for (int elementos : vetor) {
            System.out.print(elementos + " ");
        }
        System.out.println("");
        int numero = 6;
        ordenar.BuscaBinaria(vetor, numero);

    }

    public void ordena_insercao(int vetor[], int tamanho) {
        int atual;
        int i;
        int j;
        for (i = 1; i < tamanho; i++) {
            atual = vetor[i];
            j = i - 1;
            while (j >= 0 && atual < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
    }

    public void BuscaBinaria(int vetor[], int numero) {

        int inicio = 0;
        int fim = vetor.length;
        int meio = (inicio + fim) / 2;
        boolean localizador = false;
        while (inicio <= fim && localizador == false) {
            if (vetor[meio] == numero) {
                localizador = true;
            } else {
                if (numero < vetor[meio]) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
                meio = (inicio + fim) / 2;
            }
        }
        meio = (inicio + fim) / 2;
        if (localizador) JOptionPane.showMessageDialog(null, "Número " + numero + " encontrado!");
    }
}
