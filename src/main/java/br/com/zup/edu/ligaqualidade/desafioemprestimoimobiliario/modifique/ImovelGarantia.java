package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

public class ImovelGarantia {
    private String idImovelGarantia;
    private float valorImovelGarantia;
    private String estadoImovelGarantia;

    public ImovelGarantia(String idImovelGarantia, float valorImovelGarantia, String estadoImovelGarantia) {
        this.idImovelGarantia = idImovelGarantia;
        this.valorImovelGarantia = valorImovelGarantia;
        this.estadoImovelGarantia = estadoImovelGarantia;
    }

    public String getIdImovelGarantia() {
        return idImovelGarantia;
    }

    public void setIdImovelGarantia(String idImovelGarantia) {
        this.idImovelGarantia = idImovelGarantia;
    }

    public float getValorImovelGarantia() {
        return valorImovelGarantia;
    }

    public void setValorImovelGarantia(float valorImovelGarantia) {
        this.valorImovelGarantia = valorImovelGarantia;
    }

    public String getEstadoImovelGarantia() {
        return estadoImovelGarantia;
    }

    public void setEstadoImovelGarantia(String estadoImovelGarantia) {
        this.estadoImovelGarantia = estadoImovelGarantia;
    }
}
