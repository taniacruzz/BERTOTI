// package EngenhariaDeSoftware;
public class Parente {
    private String nome;
    private int grauDeParentesco;
    private String visaoPolitica;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGrauDeParentesco(int grauDeParentesco){
        this.grauDeParentesco = grauDeParentesco;
    }
    public void setVisaoPolitica(String visaoPolitica){
        this.visaoPolitica = visaoPolitica;
    }

    public String getNome(){
        return nome;
    }

    public int getGrauDeParentesco(){
        return grauDeParentesco;
    }

    public String getVisaoPolitica(){
        return visaoPolitica;
    }


    public boolean serChato(){
        return true;
        
    }
    
}
