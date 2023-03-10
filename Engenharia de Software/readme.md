# 17/02/2023
## TEXTO BASE
"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

## COMENTÁRIO
Entendo que a programação é uma das ferramentas usadas por um engenheiro de software. Enquanto no ato de programar as questões que devem ser consideradas são "apenas"
técnicas, na engenharia de software deve haver uma preocupação com o gerenciamento de todo o projeto, o qual, por sua vez, está diretamente ligado ao funcionamento da empresa.
Assim, o engenheiro de software deverá se preocupar com a passagem do tempo e com o deadline para a entrega das funcionalidades, que podem passar por modificações 
ao longo da sprint, algumas vezes a pedido do cliente, em outras simplesmente pela decisão, por parte da equipe, de mudar de rota. Deve haver uma preocupação com o escopo do projeto e com a eficiência que este projeto demanda e assim, considerando que há limitantes como tempo, dinheiro, limitações técnicas, o engenheiro de software terá que tomar decisões complexas, muitas vezes sacrificando algumas partes do projeto em prol de outras que para ele são mais relevantes. Exemplo: o engenheiro de software poderá ter que sacrificar a usabilidade do software em prol de melhorar algum requisito funcional. 

# 24/02/2023
## TEXTO BASE
"Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

## PERGUNTAS
### 1) O QUE É ENGENHARIA DE SOFTWARE E QUAL SUA RELAÇÃO COM PROGRAMAÇÃO?
Engenharia de Software abrange todo processo de geração do software, sendo que a programação é uma das ferramentas da engenharia de software. 
Embora a programação seja um dos pilares da engenharia de software, pois é através dela que os softwares são criados, a engenharia de software envolve também o fator tempo, isto é, envolve a preocupação com prazos de entrega e também envolve práticas que irão manter o programa em bom funcionamento a longo prazo.

### 2) O QUE SÃO REQUISITOS?
São citérios que o software precisa atender.

A) FUNCIONAIS:
São características ou funções que os desenvolvedores precisam implementar para que torne possível o usuário usar uma funcionalidade. Exemplo: sistema de autenticação, interface, um dashboard que permita ao usuário visualização de diversos dados.

B) NÃO FUNCIONAIS:
São características do design do sistema que irão melhorar a forma de execução de uma funcionalidade. Exemplo: implemento de um código que irá tornar possível que milhares de usuários utilizem uma funcionalidade ao mesmo tempo, uma interface que seja adapatada pra que um tipo específico de usuário use o sistema com mais facilidade, como um interface simples e intuitiva para o público idoso.

C) EXEMPLOS DE TRADE-OFFS EM REQUISITOS NÃO FUNCIONAIS: 
O uso de uma linguagem mais difícil (exemplo: java), isto é, mais próxima da linguagem da máquina permite maior portabilidade, porém pode ter como consequencia uma manutenção mais complicada. Melhorar a usabilidade para um público que tem mais dificuldade em usar um software pode exigir diminuição de eficiência, como por exemplo, mais passos para execução de uma funcionalidade.

# 06/03/2023
## FAZER UML QUALQUER SISTEMA DA SUA ESCOLHA
### Primeira Versão
![alt text for screen readers](https://github.com/taniacruzz/BERTOTI/blob/main/Engenharia%20de%20Software/UML.jpg)

# 10/03/2023

public class Estoque {
    
    private List<Produto> produtos = new List<Produto>;
    public int capacidade;
    public String localizacao;
    
        
    public void addProduto(Produto prod){
        produtos.add(prod);
    
    }
    
    public List<Produto> buscarProdutoPorNome(String nomeProduto){
        List<Produto> produtosResult = new List<Produto>;
        for (Produto produto: produtos){
            if produto.getName().equals(nomeProduto){
                produtosResult.add(produto)

            }
        }
        return produtosResult;
    }
        
    
    public static void main(String[] args){
 
    }
            
}

