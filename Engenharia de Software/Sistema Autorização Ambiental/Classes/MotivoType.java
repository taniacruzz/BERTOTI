public enum MotivoType {
    justifictiva(0, "Corte de Árvores Isoladas"),
    competencia(1, "Intervenção em APP");

    private Integer intValue;
    private String stringValue;

    private MotivoType (Integer intValue, String stringValue){
        this.intValue = intValue;
        this.stringValue = stringValue;
    }
        
        
    
    
    
}
