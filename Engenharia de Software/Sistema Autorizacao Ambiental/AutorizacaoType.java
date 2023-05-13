public enum AutorizacaoType {
    CorteArvoresIsoladas (0, "Corte de Árvores Isoladas"),
    CorteDeFragmento(1, "Corte de Fragmento de Vegetação"),
    IntervencaoEmAPP(2, "Intervenção em APP");

    private Integer intValue;
    private String stringValue;

    private AutorizacaoType (Integer intValue, String stringValue){
        this.intValue = intValue;
        this.stringValue = stringValue;
    }
    
    

}
