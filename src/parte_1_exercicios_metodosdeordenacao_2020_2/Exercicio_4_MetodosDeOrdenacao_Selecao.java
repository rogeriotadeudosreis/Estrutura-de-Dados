package parte_1_exercicios_metodosdeordenacao_2020_2;

public class Exercicio_4_MetodosDeOrdenacao_Selecao {
    
    public static void main(String[] args) {
        
       String dados = "A disciplina de hj é > Estrutura de Dados";
       dados = dados;
       
       char dadoschar[] = dados.toCharArray();
       
        for (int i = 0; i < dadoschar.length - 1; i++) {
            int menor = i;
            for (int j = i+1; j < dadoschar.length; j++) {
                if (dadoschar[menor] > dadoschar[j]) {
                    menor = j;
                    
                }
            }
            char aux = dadoschar[i];
            dadoschar[i] = dadoschar[menor];
            dadoschar[menor] = aux;
        }
        String ordena = new String(dadoschar);
        System.out.println(ordena);
        
    }
    
}
