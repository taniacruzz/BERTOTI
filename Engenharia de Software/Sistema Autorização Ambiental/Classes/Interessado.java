import java.util.ArrayList;
import java.util.List;


public class Interessado {

    private String razaoSocial;
    private String endereco;
    private String atividadePrincipal;
    private List<Obra> obrasSolicitadas = new ArrayList<>();
    private List<Obra> obrasAutorizadas = new ArrayList<>();

    

    public Interessado(String razaoSocial, String endereco, String atividadePrincipal, List<Obra> obrasSolicitadas, List<Obra> obrasAutorizadas) {
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.atividadePrincipal = atividadePrincipal;
        this.obrasSolicitadas = obrasSolicitadas;
        this.obrasAutorizadas = obrasAutorizadas;
    }

    public void solicitarAutorizacao(Obra obraSolicitada){
        OrgaoLicenciador orgaoLicenciador;        
        if(obraSolicitada.isZonaRural() == true){orgaoLicenciador = new OrgaoLicenciador("São Paulo", "Cetesb");}
        else{orgaoLicenciador = new OrgaoLicenciador("Municipio", "Secretaria de Meio Ambiente");}
        Boolean resposta = orgaoLicenciador.concederAutorizacao(obraSolicitada);
        if(resposta == true){obrasAutorizadas.add(obraSolicitada);}
        
    }
    
    public void realizarCompensacaoAmbiental(){

    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public List<Obra> getObrasSolicitadas() {
        return obrasSolicitadas;
    }

    public List<Obra> getObrasAutorizadas() {
        return obrasAutorizadas;
    }
}
