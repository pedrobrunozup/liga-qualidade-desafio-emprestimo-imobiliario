package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.StringTokenizer;

public class ProcessaEventosDeImovelGarantia {
    public static void processa(String acao, String idProposta, ListaDePropostas listaDePropostas, StringTokenizer stringTokenizer) {
        listaDePropostas.getListaDePropostas().forEach(proposta -> {
            if (proposta.getIdProposta().equals(idProposta)){
                if (acao.equals("added")) {
                    proposta.adicionarImovelGarantia(stringTokenizer.nextToken(),Float.parseFloat(stringTokenizer.nextToken()),stringTokenizer.nextToken());
                }
                if (acao.equals("updated")) {
                    proposta.atualizarImovelGarantia(stringTokenizer.nextToken(),Float.parseFloat(stringTokenizer.nextToken()),stringTokenizer.nextToken());
                }
                if (acao.equals("removed")) {
                    proposta.removerImovelGarantia(stringTokenizer.nextToken());
                }
            }
        });
    }
}
