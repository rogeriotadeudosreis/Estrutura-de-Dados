
package exercicios_casos_de_estudos;

public class Metodo_string_CharAt {
    
    public static void main(String[] args) {
        
        String valor = "Devmedia - Java";
        char[] carac = new char[256];
        
        for (int i = 0; i < valor.length(); i++) {
            System.out.printf("%c ", valor.charAt(i));
        }
        
        for (int i = 0; i < valor.length(); i++) {
            carac[i] = valor.charAt(i);
        }
        System.out.println("");
        for (int i = 0; i < carac.length; i++) {
            if (carac[i] > 0) {
            System.out.print(carac[i] + " ");
            }
        }
            System.out.println("");
        
        
        
        
        
    }
    
}
