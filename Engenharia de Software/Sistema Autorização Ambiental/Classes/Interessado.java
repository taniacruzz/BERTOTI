import java.util.ArrayList;
import java.util.List;


public class Interessado {

    private String razaoSocial;
    private String endereco;
    private String atividadePrincipal;
    private AutorizacaoType objetivoPedido;
    private List<Obra> obrasSolicitadas = new ArrayList<>();
    private List<Obra> obrasAutorizadas = new ArrayList<>();

    

    public Interessado(String razaoSocial, String endereco, String atividadePrincipal, AutorizacaoType objetivoPedido,
            List<Obra> obrasSolicitadas, List<Obra> obrasAutorizadas) {
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.atividadePrincipal = atividadePrincipal;
        this.objetivoPedido = objetivoPedido;
        this.obrasSolicitadas = obrasSolicitadas;
        this.obrasAutorizadas = obrasAutorizadas;
    }

    public void solicitarAutorizacao(boolean zonaRural, boolean ZonaApp, boolean corteDeArvores, 
            String endereco, Double area, List<Arvore> arvoresSolicitadas, String motivo){
        Obra obraSolicitada = new Obra(zonaRural, ZonaApp, corteDeArvores, endereco, area, arvoresSolicitadas, motivo);
        obraSolicitada.setMotivo(motivo.toLowerCase());
        OrgaoLicenciador orgaoLicenciador;        
        if(zonaRural == false){orgaoLicenciador = new OrgaoLicenciador("São Paulo", "Cetesb");}
        else{orgaoLicenciador = new OrgaoLicenciador("Municipio", "Secretaria de Meio Ambiente");}
        orgaoLicenciador.concederAutorizacao(obraSolicitada);

        
    }
    
    public void realizarCompensacaoAmbiental(){

    }
}
