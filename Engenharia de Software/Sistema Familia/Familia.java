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

   

    public void setnDeFamiliares(int nDeFamiliares){
        this.nDeFamiliares = nDeFamiliares;
        
    }

    public void setParentes(List<Parente> parentes){
        this.parentes = parentes;
    }

    public int getnDeFamiliares(){
        return nDeFamiliares;
    }

    public List<Parente> getParentes(){
        return parentes;
    }

    
 
        

    public Parente decidirAlvoDaFofoca(List<Parente> parentes){
        Random random = new Random();
        int randomIndex = random.nextInt(parentes.size());
        return parentes.get(randomIndex);
        
    }

    public static void fofocar(Parente parente){
        if(parente.getVisaoPolitica() == "Direita"){
            System.out.println("bora fofocar");
        }
        else{
            System.out.println("Deixa baixo");
        }

    }
        

}

