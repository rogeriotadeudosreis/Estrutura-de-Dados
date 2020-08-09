

import java.util.Random;

public class SomandoElementosDeUmArray {
   
    public static void main(String[] args) {
        
        Random valor = new Random();

        int arrayElementos[];
        arrayElementos = new int[10];
        int soma = 0;
        System.out.println("Valores gerados para este array:");
        for (int cont = 0; cont < arrayElementos.length; cont++) {
            arrayElementos[cont] = valor.nextInt(100);
            soma += arrayElementos[cont];

            System.out.print(arrayElementos[cont] + " ");
        }
        System.out.print("\nSoma total dos elementos do array: ");

        System.out.printf("%d\n", soma);
    }
}
