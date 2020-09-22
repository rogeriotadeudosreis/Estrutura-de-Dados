package exercicios_casos_de_estudos;



import java.util.Random;

public class PesquisaComArray {

    public static void main(String[] args) {
        
        Random valor = new Random();
        int nota = 0;
        int respostas[] = new int [40];
        int frequencia[] = new int[11];

        System.out.printf("%s%11s\n", "Resposta", "Avaliação");
        for (int cont = 0; cont < respostas.length; cont++) {

            nota = valor.nextInt(10) + 1;
            respostas[cont] = nota;
            
            if (respostas[cont] == 1) {
                System.out.printf("%8d%11s\n", respostas[cont], "Horrível");
            }
            if (respostas[cont] == 10) {
                System.out.printf("%8d%11s\n", respostas[cont], "Excelente");
            }
        }
        System.out.println("********************* Solução proposta pelo livro *********************");
        String classificacao = "";
        for (int cont = 0; cont < respostas.length; cont++) {
            frequencia[respostas[cont]]++;

        }
        System.out.printf("%s%11s%14s\n", "Avaliação", "Frequência", "Classificação");

        for (int avaliacao = 1; avaliacao < frequencia.length; avaliacao++) {
            if (avaliacao == 1) {
                classificacao = "Horrível";
            }
            else if (avaliacao == 10) {
                classificacao = "Excelente";
            }else {
                classificacao = "*";
            }
            System.out.printf("%9d%11d%14s\n", avaliacao, frequencia[avaliacao], classificacao);
        }
    }
    
}
