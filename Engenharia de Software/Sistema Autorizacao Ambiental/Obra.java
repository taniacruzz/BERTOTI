import java.util.ArrayList;
import java.util.List;

public class Obra {
    private boolean zonaRural;
    private boolean zonaApp;
    private boolean corteDeArvores;
    private String endereço;
    private Boolean area;
    private List<Arvore> arvoresSolicitadas = new ArrayList<>(0);
    private String motivo;
    
    public Obra(boolean zonaRural, boolean zonaApp, boolean corteDeArvores, String endereço, Boolean area,
            List<Arvore> arvoresSolicitadas) {
        this.zonaRural = zonaRural;
        this.zonaApp = zonaApp;
        this.corteDeArvores = corteDeArvores;
        this.endereço = endereço;
        this.area = area;
        this.arvoresSolicitadas = arvoresSolicitadas;
        this.motivo = motivo;
    }

    public boolean isZonaRural() {
        return zonaRural;
    }

    public boolean isZonaApp() {
        return zonaApp;
    }

    public boolean isCorteDeArvores() {
        return corteDeArvores;
    }

    public String getEndereço() {
        return endereço;
    }

    public Boolean getArea() {
        return area;
    }

    public List<Arvore> getArvoresSolicitadas() {
        return arvoresSolicitadas;
    }

    public String getMotivo(){
        return motivo;
    }

    
}
