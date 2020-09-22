
package exercicios_casos_de_estudos;

public class Metodo_string_CodePointAt {
    
    public static void main(String[] args) {
        
        String valor = "Devmedia - Java";
        
        //Aqui o método pega a posição da String e retorna o valor em UNICODE
        System.out.println(valor.codePointAt(0));
        
    }
    
}
