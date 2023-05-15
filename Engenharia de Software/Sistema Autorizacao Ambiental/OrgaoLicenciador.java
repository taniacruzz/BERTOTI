import java.util.ArrayList;
import java.util.List;

public class OrgaoLicenciador {
    private String areaDeAtuacao;
    private String Nome;
    static List<String> motivosAceitos;
    
    public OrgaoLicenciador(String areaDeAtuacao, String nome) {
        this.areaDeAtuacao = areaDeAtuacao;
        Nome = nome;
    }

    public boolean concederAutorizacao(Obra obraSolicitada){
        if(motivosAceitos.contains(obraSolicitada.getMotivo())){
        boolean resposta;
        resposta = true;
        return resposta;
        }
        return false;
    }

    public void suspenderAutorização(){

    }

    public List<String> editarMotivosAceitos(List<String> motivosExcluir, List<String> motivosIncluir){
        for(String motivoToExclude: motivosExcluir){motivosAceitos.remove(String.valueOf(motivoToExclude));}
        for(String motivoToInclude: motivosIncluir){motivosAceitos.add(motivoToInclude);}
        return motivosAceitos;

    }
    

    
}
