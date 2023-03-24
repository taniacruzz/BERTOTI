// package EngenhariaDeSoftware;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Familia {
   
    int nDeFamiliares;
    List<Filho> filhos;
    Chefe chefeDeFamilia;
    boolean patriarcal;
    List<Parente> parentes;


    // public Familia(){
    //     this.parentes = 
    // }

    
    
    

    public Parente decidirAlvoDaFofoca(){
        Random random = new Random();
        int randomIndex = random.nextInt(parentes.size());
        return parentes.get(randomIndex);
        
    }

    public static void fofocar(Parente parente){

    }
        

}

