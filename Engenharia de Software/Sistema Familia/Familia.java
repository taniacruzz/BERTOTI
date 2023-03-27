// package EngenhariaDeSoftware;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Familia {
   
    private int nDeFamiliares;
    private List<Filho> filhos;
    private Chefe chefeDeFamilia;
    private boolean patriarcal;
    private List<Parente> parentes;

    public Familia(int nDeFamiliares,List<Filho> filhos, Chefe chefeDeFamilia, boolean patriarcal, List<Parente> parentes){
        this.nDeFamiliares = nDeFamiliares;
        this.filhos = filhos;
        this.chefeDeFamilia = chefeDeFamilia;
        this.patriarcal = patriarcal;
        this.parentes = parentes;
        
    }

    public get


    
    
    

    public Parente decidirAlvoDaFofoca(){
        Random random = new Random();
        int randomIndex = random.nextInt(parentes.size());
        return parentes.get(randomIndex);
        
    }

    public static void fofocar(Parente parente){

    }
        

}

