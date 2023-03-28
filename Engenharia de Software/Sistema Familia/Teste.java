// package EngenhariaDeSoftware;
import java.util.ArrayList;
import java.util.List;


public class Teste {
    public static void main(String[]args){

        // Teste sem colocar private nos atributos de parente
        // Parente parente1 = new Parente();
        // parente1.grauDeParenesco = 2;
        // parente1.visaoPolitica = "Direita";

        // Teste acrescentando private nos atributos de parente
        Parente parente1 = new Parente();
        parente1.setNome("Tia Claudia");
        parente1.setGrauDeParentesco(2);
        parente1.setVisaoPolitica("Direita");

        Parente parente2 = new Parente();
        parente2.setNome("Primo Marx");
        parente2.setGrauDeParentesco(3);
        parente2.setVisaoPolitica("Esquerda");

        List<Parente> parentes = new ArrayList<Parente>();
        parentes.add(parente1);
        parentes.add(parente2);

        Filho filho1 = new Filho("Enzo", 19);
        Filho filho2 = new Filho("Valentina", 16);

        List<Filho> filhos = new ArrayList<Filho>();
        filhos.add(filho1);
        filhos.add(filho2);

        Chefe chefe = new Chefe("Patricia", 5000.00, false);

        Familia familia = new Familia(4, filhos, chefe, false, parentes);

        for(Parente parente: parentes){
            Familia.fofocar(parente);
        }

        Parente parenteAlvo = familia.decidirAlvoDaFofoca(familia.getParentes());
        System.out.print(parenteAlvo.getNome());

        



        
    }
    
}
