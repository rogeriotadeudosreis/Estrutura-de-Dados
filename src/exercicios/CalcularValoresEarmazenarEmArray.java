package exercicios;



public class CalcularValoresEarmazenarEmArray {

    public static void main(String[] args) {
        
        final int ARRAY_LENGTH = 10;
        int array[] = new int [ARRAY_LENGTH];
        
        for (int cont = 0; cont < array.length; cont++) {
            array[cont] = 2 + 2* cont;
            
        }
        System.out.printf("%s%8s\n", "Index", "Valor");
        
        for (int cont = 0; cont < array.length; cont++) {
            System.out.printf("%5d%8s\n", cont, array[cont]);
        }
    }
    
}
