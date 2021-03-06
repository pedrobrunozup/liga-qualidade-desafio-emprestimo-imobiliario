package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.StringTokenizer;

public class ProcessaEventosDeProponente {
    public static void processa(String acao, String idProposta, ListaDePropostas listaDePropostas, StringTokenizer stringTokenizer) {
        listaDePropostas.getListaDePropostas().forEach(proposta -> {
            if (proposta.getIdProposta().equals(idProposta)){
                proposta.adicionarProponente(stringTokenizer.nextToken(),stringTokenizer.nextToken(), Integer.parseInt(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()),Boolean.parseBoolean(stringTokenizer.nextToken()));
            }
        });
    }
}
