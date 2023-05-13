// package EngenhariaDeSoftware;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Autorizacao {
    private Interessado interessado;
    private LocalDate dataEmissao;
    private LocalDate dataValidade;
    private Obra obra;
    private AutorizacaoType autorizacaoType;
    private OrgaoLicenciador orgaoLicenciador;
    private Double areaConcedida;
    private List<Arvore> arvoresAutorizadas = new ArrayList<>();
    private boolean status;

    public boolean mudarStatus(){
        LocalDate dataAtual = LocalDate.now();
        
        if(dataAtual.isAfter(dataValidade)){
            status = false;
          
        }
        return status;
    }

    


    public static void main(String[]args){
        System.out.print("oi");
       List<String> motivosAceitos = new ArrayList<>();
       motivosAceitos.add("ola");
       System.out.print(motivosAceitos);
    
    }   
}
