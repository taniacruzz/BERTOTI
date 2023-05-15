import java.util.ArrayList;
import java.util.List;

public class Interessado {

    private String razaoSocial;
    private String endereco;
    private String atividadePrincipal;
    private AutorizacaoType objetivoPedido;
    private List<Obra> obrasSolicitadas = new ArrayList<>();
    private List<Obra> obrasAutorizadas = new ArrayList<>();


    public void solicitarAutorizacao(boolean zonaRural, boolean ZonaApp, boolean corteDeArvores, 
            String endereco, boolean area, List<Arvore> arvoresSolicitadas, String motivo){
        Obra obrasolicitada = new Obra(zonaRural, ZonaApp, corteDeArvores, endereco, area, arvoresSolicitadas, motivo);
        obrasolicitada.setMotivo(motivo.toLowerCase());
        if(OrgaoLicenciador.concederAutorizacao(obrasolicitada) == true){}
    }
    
    public void realizarCompensacaoAmbiental(){

    }
}
