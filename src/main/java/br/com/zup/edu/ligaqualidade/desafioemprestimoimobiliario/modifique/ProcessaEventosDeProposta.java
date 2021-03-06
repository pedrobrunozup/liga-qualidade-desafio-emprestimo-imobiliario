package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.StringTokenizer;

public class ProcessaEventosDeProposta {

    public static void processa(String acao, String idProposta, ListaDePropostas listaDePropostas, StringTokenizer stringTokenizer) {
        if (acao.equals("created")) {
            listaDePropostas.adicionarProposta(idProposta,Float.parseFloat(stringTokenizer.nextToken()),Integer.parseInt(stringTokenizer.nextToken()));
        }
        if (acao.equals("updated")) {
            listaDePropostas.atualizarProposta(idProposta,Float.parseFloat(stringTokenizer.nextToken()),Integer.parseInt(stringTokenizer.nextToken()));
        }
        if (acao.equals("deleted")) {
            listaDePropostas.removerProposta(idProposta);
        }
    }
}
