package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.ArrayList;

public class Proposta {
    private String idProposta;
    private float valorProposta;
    private int numeroDeParcelas;
    private ListaDeProponentes listaDeProponentes;
    private ListaDeImoveisGarantia listaDeImoveisGarantia;

    public Proposta(String idProposta, float valorProposta, int numeroDeParcelas) {
        this.idProposta = idProposta;
        this.valorProposta = valorProposta;
        this.numeroDeParcelas = numeroDeParcelas;
        this.listaDeProponentes = new ListaDeProponentes(new ArrayList<>());
        this.listaDeImoveisGarantia = new ListaDeImoveisGarantia(new ArrayList<>());
    }

    public String getIdProposta() {
        return idProposta;
    }

    public void setIdProposta(String idProposta) {
        this.idProposta = idProposta;
    }

    public float getValorProposta() {
        return valorProposta;
    }

    public void setValorProposta(float valorProposta) {
        this.valorProposta = valorProposta;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public void adicionarImovelGarantia(String idImovelGarantia, float valorImovelGarantia, String estado) {
        this.listaDeImoveisGarantia.adicionarImovelGarantia(idImovelGarantia, valorImovelGarantia, estado);
    }

    public void atualizarImovelGarantia(String idImovelGarantia, float valorImovelGarantia, String estado) {
        this.listaDeImoveisGarantia.atualizarImovelGarantia(idImovelGarantia, valorImovelGarantia, estado);
    }

    public void removerImovelGarantia(String idImovelGarantia) {
        this.listaDeImoveisGarantia.removerImovelGarantia(idImovelGarantia);
    }

    public void adicionarProponente(String idProponente, String nome, int idade, float renda, boolean principal) {
        this.listaDeProponentes.adicionarProponente(idProponente, nome, idade, renda, principal);
    }

    public boolean isPropostaValida() {
        if (this.valorProposta < 30000.00 || this.valorProposta > 3000000.00) {
            return false;
        }
        if (this.numeroDeParcelas < 24 || this.numeroDeParcelas > 180) {
            return false;
        }

        return (this.listaDeProponentes.isListaDeProponentesValida()
                && this.listaDeImoveisGarantia.isListaDeImoveisGarantiaValida());
    }
}
