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
    private String visaoPolitica;
    
    
    
    public Familia(int nDeFamiliares,List<Filho> filhos, Chefe chefeDeFamilia, boolean patriarcal, List<Parente> parentes, String visaoPolitica){
        this.nDeFamiliares = nDeFamiliares;
        this.filhos = filhos;
        this.chefeDeFamilia = chefeDeFamilia;
        this.patriarcal = patriarcal;
        this.parentes = parentes;
        this.visaoPolitica = visaoPolitica;
        
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
    
    public List<Filho> getFilhos() {
        return filhos;
    }
    public Chefe getChefeDeFamilia() {
        return chefeDeFamilia;
    }

    public List<Parente> getParentes(){
        return parentes;
    }

    public Parente decidirAlvoDaFofoca(List<Parente> parentes){
        Parente parenteAlvo = null;
        while(parenteAlvo == null){
            Random random = new Random();
            Parente parentePotencial = parentes.get(random.nextInt(parentes.size()));
            if (parentePotencial.getVisaoPolitica() != visaoPolitica & parentePotencial.serChato()==true){
                parenteAlvo = parentePotencial;
            }
        System.out.printf("Bora fofocar sobre a %s \n", parenteAlvo.getNome());
        }
        return parenteAlvo;
    }

}


