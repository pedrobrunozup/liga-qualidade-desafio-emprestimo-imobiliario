package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.List;

public class ListaDeImoveisGarantia {
    private List<ImovelGarantia> imovelGarantiaList;

    public ListaDeImoveisGarantia(List<ImovelGarantia> imovelGarantiaList) {
        this.imovelGarantiaList = imovelGarantiaList;
    }

    public void adicionarImovelGarantia(String idImovelGarantia, float valorImovelGarantia, String estado) {
        this.imovelGarantiaList.add(new ImovelGarantia(idImovelGarantia, valorImovelGarantia, estado));
    }

    public void removerImovelGarantia(String idImovelGarantia) {
        this.imovelGarantiaList.forEach(imovelGarantia -> {
            if (imovelGarantia.getIdImovelGarantia().equals(idImovelGarantia)) {
                this.imovelGarantiaList.remove(imovelGarantia);
            }
        });
    }

    public void atualizarImovelGarantia(String idImovelGarantia, float valorImovelGarantia, String estado) {
        this.imovelGarantiaList.forEach(imovelGarantia -> {
            if (imovelGarantia.getIdImovelGarantia().equals(idImovelGarantia)) {
                imovelGarantia.setValorImovelGarantia(valorImovelGarantia);
                imovelGarantia.setEstadoImovelGarantia(estado);
            }
        });
    }

    public boolean isListaDeImoveisGarantiaValida() {
        return true;
    }
}
