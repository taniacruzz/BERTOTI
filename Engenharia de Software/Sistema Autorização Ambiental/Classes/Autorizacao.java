// package EngenhariaDeSoftware;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import uk.me.jstott.jcoord.UTMRef;

public class Autorizacao {
    private Interessado interessado;
    private LocalDate dataEmissao;
    private LocalDate dataValidade;
    private Obra obra;
    private OrgaoLicenciador orgaoLicenciador;
    private Double areaConcedida;
    private List<Arvore> arvoresAutorizadas = new ArrayList<>();
    private boolean status;

    public Autorizacao(Interessado interessado, LocalDate dataEmissao, LocalDate dataValidade, Obra obra,
            AutorizacaoType autorizacaoType, OrgaoLicenciador orgaoLicenciador, Double areaConcedida,
            List<Arvore> arvoresAutorizadas, boolean status) {
        this.interessado = interessado;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
        this.obra = obra;
        this.orgaoLicenciador = orgaoLicenciador;
        this.areaConcedida = areaConcedida;
        this.arvoresAutorizadas = arvoresAutorizadas;
        this.status = status;
    }




    public boolean mudarStatus(){
        LocalDate dataAtual = LocalDate.now();
        
        if(dataAtual.isAfter(dataValidade)){
            status = false;
          
        }
        return status;
    }

    


    public static void main(String[]args){
        OrgaoLicenciador orgaoLicenciador = new OrgaoLicenciador("São Paulo", "Cetesb");
        List<String> motivosAexcluir = new ArrayList<>();
        List<String> motivosAincluir = new ArrayList<>();
        motivosAincluir.add("interesse social");
        motivosAincluir.add("baixo impacto");
        motivosAincluir.add("utilidade pública");

        

    }
   
        
    
}   

