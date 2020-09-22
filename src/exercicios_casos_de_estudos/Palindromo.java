package exercicios_casos_de_estudos;

import java.util.Scanner;

public class Palindromo {
    
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        int[] vetor = new int [10];
       
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Entre com O %d.o número para a posição: ", i + 1);
            vetor[i] = imput.nextInt();
        }
        
        boolean palindromo = true;
        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[vetor.length -1 - i]) {
                palindromo = false;
                break;
            }
        }
        
        System.out.print("Vetor: ");
        for (int valores: vetor) {
            System.out.print(valores + " ");
        }
        System.out.println("");
        
        if (palindromo) {
            System.out.println("É palindromo.");
        }else{
            System.out.println("Não é palindromo.");
        }
       
        
        
        
    }
    
}
