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
        if(filho.getIdade() > 18){
            return true;
        }
        else{
            return false;
        }

    }

    public void darAmor(Filho filho){

    }

    public Double trabalhar(){
        return this.salario;

    }
}
