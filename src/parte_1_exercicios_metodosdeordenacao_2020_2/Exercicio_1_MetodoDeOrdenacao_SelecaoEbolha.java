package parte_1_exercicios_metodosdeordenacao_2020_2;

public class Exercicio_1_MetodoDeOrdenacao_SelecaoEbolha {

    public static void main(String[] args) {

        int[] numA = {1, -13, 5, 8, 10, 12};
        

        for (int i = 0; i < numA.length; i++) {
            int menor = 1;
            for (int j = i + 1; j < numA.length; j++) {
                if (numA[menor] > numA[j]) {
                    menor = j;
                }
            }
            int aux = numA[i];
            numA[i] = numA[menor];
            numA[menor] = aux;
            System.out.print(numA[i] + " ");
        }

    }

}
