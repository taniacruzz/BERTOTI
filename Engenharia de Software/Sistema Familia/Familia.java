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
        Parente parenteAlvo = null;
        while(parenteAlvo == null){
            Random random = new Random();
            Parente parentePotencial = parentes.get(random.nextInt(parentes.size()));
            if (parentePotencial.getVisaoPolitica() == "Direita"){
                parenteAlvo = parentePotencial;
                
            }
            
        }
        return parenteAlvo;
        
        
    }

    public static void fofocar(Parente parente){
        if(parente.getVisaoPolitica() == "Direita"){
            System.out.printf("Bora fofocar sobre a %s \n", parente.getNome());
        }
        else{
            System.out.printf("%s não merece ser alvo de fofoca \n", parente.getNome());
        }

    }
        

}

