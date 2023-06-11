import java.util.ArrayList;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;

public class Testes extends TestCase{


    @org.junit.Test
    public void test(){
        
        List<Arvore> arvores1 = new ArrayList<Arvore>();
        arvores1.add(new Arvore("pinheiro", 3.3, 10.0, 7100.0, 80850.0));
        arvores1.add(new Arvore("leucena", 4.0, 12.1, 7000.0, 80800.0));
        assertEquals(111.8, OrgaoLicenciador.calculateAverageDistance(arvores1), 1.0);

        OrgaoLicenciador orgaoLicenciador = new OrgaoLicenciador("São Paulo", "Cetesb");
        List<String> motivosAexcluir = new ArrayList<>();
        List<String> motivosAincluir = new ArrayList<>();
        List<String> listaEsperada = new ArrayList<>();

        motivosAincluir.add("interesse social");
        motivosAincluir.add("baixo impacto");
        motivosAincluir.add("utilidade pública");
        

        listaEsperada.add("interesse social");
        listaEsperada.add("baixo impacto");
        listaEsperada.add("utilidade pública");
        assertEquals(listaEsperada, orgaoLicenciador.editarMotivosAceitos(motivosAexcluir, motivosAincluir));

        List<Arvore> arvores = new ArrayList<Arvore>();
        Arvore arvore1 = new Arvore("pinheiro", 3.0, 12.0, 397738.0, 7424744.0);
        Arvore arvore2 = new Arvore("ypê", 5.0, 11.0, 397751.0, 7424744.0);
        Arvore arvore3 = new Arvore("leucena", 6.0, 15.0, 397754.0, 7424722.0);
        Arvore arvore4 = new Arvore("abacateiro", 4.0, 12.0, 397694.0, 7424735.0);
        arvores.add(arvore1);
        arvores.add(arvore2);
        arvores.add(arvore3);
        arvores.add(arvore4);

        Obra obraASolicitar = new Obra(true, false, true, "Rua de Terra, 400", 1000.0, arvores, "interesse social");
        Obra obraASolicitar2 = new Obra(false, false, true, "Rua Maciel, 200", 1000.0, arvores, "ganhar dinheiro");
        List<Obra> obrasASolicitar = new ArrayList<>();
        obrasASolicitar.add(obraASolicitar);
        obrasASolicitar.add(obraASolicitar2);
        List<Obra> obrasAutorizadas = new ArrayList<>();

        Interessado interessado = new Interessado("Energeticus", "Rua Andromeda", "produção de cabos",
            obrasASolicitar, obrasAutorizadas);
        
        for(Obra obra: obrasASolicitar){
            interessado.solicitarAutorizacao(obra);
            
        }
        
        assertEquals("Rua de Terra, 400", obrasAutorizadas.get(0).getEndereço());
    }

    


}
