
package exercicios_casos_de_estudos;

public class Metodo_string_TocharArray {
    
    public static void main(String[] args) {
        
        String valor = "Devmedia - Java";
        
        for (char c : valor.toCharArray()) {
            System.out.println("Char: " + c);
        }
        
    }
    
}
