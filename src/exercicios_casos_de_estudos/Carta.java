package exercicios_casos_de_estudos;

public class Carta {
    
    private String face;// face da carta
    private String suit;// naipe da carta
    
    public Carta (String faceCarta, String naipeCarta){
        faceCarta = face;//inicializa a face dacarta
        naipeCarta = suit;//inicializa o naipe da carta
    }
    //retorna representação String da carta
    public String toString(){
        return face + " of " + suit;
    }    
}
