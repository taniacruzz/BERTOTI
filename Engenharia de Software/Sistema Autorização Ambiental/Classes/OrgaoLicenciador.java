import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrgaoLicenciador {
    private String areaDeAtuacao;
    private String nome;
    static List<String> motivosAceitos;
    
    public OrgaoLicenciador(String areaDeAtuacao, String nome) {
        this.areaDeAtuacao = areaDeAtuacao;
        this.nome = nome;
    }

    // calculo da distancia media entre arvores. Se essas árvores estiverem muito próximas, então é considerado fragmento florestal
    public static Double calculateAverageDistance(List<Arvore> arvoresObra){
        Double distance = 0.0;
        Double averageDistance = 0.0;
        Integer contador = 0;
        for(int i = 0; i < arvoresObra.size() - 1; i++){
            for(int j = i + 1; j < arvoresObra.size(); j++){
                distance = distance + Math.sqrt(Math.pow((arvoresObra.get(i).getLongitude()) - arvoresObra.get(j).getLongitude(), 2) + 
                Math.pow((arvoresObra.get(i).getLatitude() - arvoresObra.get(j).getLatitude()), 2));
                ++contador;
            }
        }
        averageDistance = distance / contador;
        return distance;
    }
    

    public boolean concederAutorizacao(Obra obraSolicitada){
        String motivoRecusa;
        if(motivosAceitos.contains(obraSolicitada.getMotivo())){
            if(this.nome != "Cetesb" && (calculateAverageDistance(obraSolicitada.getArvoresSolicitadas()) < 2.0 )){
                // System.out.println("As árvores estão muito próximas, não sendo isoladas, mas sim fazendo parte de um fragmento de vegetação. O processo deverá ser realizado pela Cetesb");
                motivoRecusa = "Apenas o órgão estadul tem competência para emitir autorização para supressão de fragmento de vegetação";
                return false;
            }
            else{
                LocalDate now = LocalDate.now();
                return true;
            }
        }
        motivoRecusa = "A justificativa dada não é aceita para supressão de vegetação";
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
