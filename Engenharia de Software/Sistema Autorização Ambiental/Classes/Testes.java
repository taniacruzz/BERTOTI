import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;

public class Testes extends TestCase{

    @org.junit.Test
    public void test(){
            List<Arvore> arvores = new ArrayList<Arvore>();
            arvores.add(new Arvore("pinheiro", 3.3, 10.0, 7100.0, 80850.0));
            arvores.add(new Arvore("leucena", 4.0, 12.1, 7000.0, 80800.0));
            assertEquals(OrgaoLicenciador.calculateAverageDistance(arvores), 111.8);
    }

    
}
