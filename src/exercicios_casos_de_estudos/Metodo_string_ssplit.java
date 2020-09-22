/*
 O método split cria um array de Strings com base no “regex” passado 
via parâmetro, ou seja, ele divide a String em várias outras Strings 
com base no seu regex, o que é muito útil para separar tags em uma 
String completa, ex: “software, engenharia, computação”.
Você pode transformar essa única String em um array com três Strings.
Este método também possui uma variação, que é o parâmetro “int limit”,
onde você identifica quantas vezes o regex será aplicado em toda String. 
 */
package exercicios_casos_de_estudos;

public class Metodo_string_ssplit {

    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";
        String[] valorComSplit = valor.split("-");

        for (String s : valorComSplit) {
            System.out.println(s + " ");
        }
        System.out.println("-----------------------------------------");

        valor = "DEVMEDIA - Java - Engenharia - Software";
        valorComSplit = valor.split("-", 2);

        for (String s : valorComSplit) {
            System.out.println(s + " ");
        }
        System.out.println("");
    }

}
