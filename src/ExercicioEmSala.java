


public class ExercicioEmSala {
    
    public static void main(String[] args) {
        
        int notas [] = {8,87,32,44,46,76,11,26,67,92};        
        int array[]= new int [11];
        
        for (int i = 0; i < notas.length; i++) {
            array[notas[i]/10]++;
            
        }
        for (int i = 0; i < array.length-1; i++) {
            System.out.printf("%02d-%02d:%d\n",10* i, 10*i+9, array[i]); 
        }
       System.out.printf("  100:%d\n",array[10]); 
       
       //descobrir a maior nota
       int maior = notas[0];
       int pos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                pos = i;
                maior = notas[i];
            }
        }
        System.out.println("Maior: " + maior + "\nposição: " + pos);
    }
    
}
