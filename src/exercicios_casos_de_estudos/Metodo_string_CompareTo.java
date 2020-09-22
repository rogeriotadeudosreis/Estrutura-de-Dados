
package exercicios_casos_de_estudos;

public class Metodo_string_CompareTo {
    
    public static void main(String[] args) {
        
        String valor = "Devmedia - Java";
        
        System.out.println(valor.compareTo("Devmedia - Java") == 0 ? true : false);
        System.out.println(valor.compareTo("Devmedia - JAVA") == 0 ? true : false);
        System.out.println(valor.compareToIgnoreCase("Devmedia - JAVA") == 0 ? true : false);
        
    }
    
}
