// package EngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.List;

public class Parente {
    private String nome;
    private int grauDeParentesco;
    private String visaoPolitica;
    private Double salario;
    private List<Familia> familias;

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

    public List<Familia> visitarFamilia(List<Familia> familias){
        List<Familia> familiasAvisitar = new ArrayList<Familia>();
        for(Familia f: familias){
            if(f.getFilhos().size() > 0 && f.getChefeDeFamilia().salario > salario){
                familiasAvisitar.add(f);

            }
        }
        return familiasAvisitar;

    }

    public boolean serChato(){
        return true;
    }
    
}
