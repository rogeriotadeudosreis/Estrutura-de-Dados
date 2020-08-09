

public class Array {
    
    public static void main(String[] args) {
        
        int array[];
        array = new int [10];
        
        System.out.printf("%s%8s\n", "Index","Valor");
        
        for (int cont = 0; cont < array.length; cont++) {
            System.out.printf("%5s%8s\n", cont, array[cont]);
        }
    }
    
}
