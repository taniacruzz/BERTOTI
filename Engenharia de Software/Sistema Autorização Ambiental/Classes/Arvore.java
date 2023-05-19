
public class Arvore {
    private String especie;
    private Double volumeDaTora;
    private Double altura;
    private Double longitude;
    private Double latitude;

    public Arvore(String especie, Double volumeDaTora, Double altura, Double longitude, Double latitude) {
        this.especie = especie;
        this.volumeDaTora = volumeDaTora;
        this.altura = altura;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    // GETTERS AND SETTERS
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Double getVolumeDaTora() {
        return volumeDaTora;
    }
    public void setVolumeDaTora(Double volumeDaTora) {
        this.volumeDaTora = volumeDaTora;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    
}
