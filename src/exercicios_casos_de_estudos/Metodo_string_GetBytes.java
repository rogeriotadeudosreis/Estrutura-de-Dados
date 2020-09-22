
package exercicios_casos_de_estudos;

public class Metodo_string_GetBytes {
    
    public static void main(String[] args) {
        
    String valor = "DEVMEDIA - Java";
    
        for (byte codigo : valor.getBytes()) {
            System.out.println("byte: " + codigo);
        }
    }
    
    
}
