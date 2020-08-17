package exercicios;



public class InicializandoUmArray {

    public static void main(String[] args) {
        
        //inicializando um array diretamente sem o new
        int array[] = {32,27,64,18,95,14,90,70,60,50};
        
        System.out.printf("%s%8s\n", "Index", "Valor");
        
        for (int cont = 0; cont < array.length; cont++) {
            System.out.printf("%5d%8s\n", cont, array[cont]);
        }
    }
    
}
