import junit.framework.Test;
import junit.framework.TestCase;

public class Testes extends TestCase implements Test{

    @Test
    public void test(){
        calculateAverageDistance(
            [new Arvore("pinheiro", 3.3, 10.0, 7100, 80850), new Arvores("leucena", 4.0, 12.1, 7000, 80800)], 
            111.8)
    }

    
}
