package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.List;

public class ListaDePropostas {
    private List<Proposta> listaDePropostas;

    public ListaDePropostas(List<Proposta> listaDePropostas) {
        this.listaDePropostas = listaDePropostas;
    }

    public List<Proposta> getListaDePropostas() {
        return listaDePropostas;
    }

    public void setListaDePropostas(List<Proposta> listaDePropostas) {
        this.listaDePropostas = listaDePropostas;
    }

    public void adicionarProposta(String idProposta, float valorProposta, int numeroDeParcelas) {
        this.listaDePropostas.add(new Proposta(idProposta, valorProposta, numeroDeParcelas));
    }

    public void removerProposta(String idProposta) {
        this.listaDePropostas.forEach(proposta -> {
            if (proposta.getIdProposta().equals(idProposta)) {
                this.listaDePropostas.remove(proposta);
            }
        });
    }

    public void atualizarProposta(String idProposta, float valorProposta, int numeroDeParcelas) {
        this.listaDePropostas.forEach(proposta -> {
            if (proposta.getIdProposta().equals(idProposta)) {
                proposta.setValorProposta(valorProposta);
                proposta.setNumeroDeParcelas(numeroDeParcelas);
            }
        });
    }
}
