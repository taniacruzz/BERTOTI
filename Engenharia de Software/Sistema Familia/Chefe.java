// package EngenhariaDeSoftware;
public class Chefe{
    String nome;
    Double salario;
    boolean toxico;

    public Chefe(String nome, Double salario, boolean toxico){
        this.nome = nome;
        this.salario = salario;
        this.toxico = toxico;
    }

    public boolean expulsarFilhodeCasa (Filho filho){
        if(filho.getIdade() > 18 && filho.getTrabalha() == true){
            return true;
        }
        else{
            return false;
        }

    }

    public Double trabalhar(){
        return this.salario;

    // teste

    }
}
