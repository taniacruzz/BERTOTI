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
    private AutorizacaoType autorizacaoType;
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
        orgaoLicenciador.editarMotivosAceitos(motivosAexcluir, motivosAincluir);

        List<Arvore> arvores = new ArrayList<Arvore>();
        Arvore arvore1 = new Arvore("pinheiro", 3.0, 12.0, 397738.0, 7424744.0);
        Arvore arvore2 = new Arvore("ypê", 5.0, 11.0, 397751.0, 7424744.0);
        Arvore arvore3 = new Arvore("leucena", 6.0, 15.0, 397754.0, 7424722.0);
        Arvore arvore4 = new Arvore("abacateiro", 4.0, 12.0, 397694.0, 7424735.0);
        arvores.add(arvore1);
        arvores.add(arvore2);
        arvores.add(arvore3);
        arvores.add(arvore4);

        Obra obraASolicitar = new Obra(true, false, true, "Rua de terra", 1000.0, arvores, "interesse social");
        Obra obraASolicitar2 = new Obra(false, false, true, "Rua de terra", 1000.0, arvores, "interesse social");
        List<Obra> obrasASolicitar = new ArrayList<>();
        obrasASolicitar.add(obraASolicitar);
        obrasASolicitar.add(obraASolicitar2);
        List<Obra> obrasAutorizadas = new ArrayList<>();

        Interessado interessado = new Interessado("Energeticus", "Rua Andromeda", "produção de cabos",
            obrasASolicitar, obrasAutorizadas);
        
        for(Obra obra: obrasASolicitar){
            interessado.solicitarAutorizacao(obra);

        }

    }
   
        
    
}   

