
package exerciciosprimeiraaulavetores;

public class Exercicio4ordenacao {
    // solução do professor
    public static void main(String[] args) {
        
        int a = 1;
        int b = 0;
        int c = 2;
        
        
        if(b < a || c < a){// a não é o menor
            if(b < c){
                int aux=a;a=b;b=aux;
            }else{
                int aux=a;a=c;c=aux;
            }
        }//simples
        //menor está em a
        if(c<b){
            int aux=b;b=c;c=aux;
        }
        System.out.print("Números ordenados:  " + a +b+ c);
    }
            
    
}
