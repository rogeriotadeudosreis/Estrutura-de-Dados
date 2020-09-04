package lista_02_vetores;

public class Exercicio_04_QuatroTriangulos {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int cont = 1;
        int cont1 = 10;       

        System.out.printf("%s%9s%5s%12s","(a)", "(b)", "(c)", "(d)\n");
        
        for (int i = 0; i < vetor.length + 1; i++) {
            for (int j = 1; j < cont; j++) {
                System.out.print("*");
            }
            System.out.printf("%2s", "");
            for (int j = 0; j < cont1; j++) {
                System.out.print("*");
            }
            System.out.printf("%2s", "");
            for (int j = 0; j < cont1; j++) {
                System.out.print("*");
            }
            System.out.printf("%2s", "");
            for (int j = 0; j < cont; j++) {
                System.out.print("*");
            }
            cont++;
            cont1--;
            System.out.println("");
        }           
    }
}
