
package exercicios_casos_de_estudos;

public class Metodo_string_Split {
    
    public static void main(String[] args) {
        
        String valor = "Devmedia - Java";
        
        String[] valorComSplit = valor.split("-");
        
        for (String string : valorComSplit) {
            System.out.print(string);
        }
        System.out.println("");
        
    }
    
}
