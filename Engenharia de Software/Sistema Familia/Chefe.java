// package EngenhariaDeSoftware;
public class Chefe{
    String nome;
    Double salario;
    boolean toxico;

    public boolean expulsarFilhoeeCasa (Filho filho){
        if(filho.idade > 18){
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
