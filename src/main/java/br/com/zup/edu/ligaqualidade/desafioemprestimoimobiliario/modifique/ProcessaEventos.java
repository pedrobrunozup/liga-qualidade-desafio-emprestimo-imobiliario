package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.StringTokenizer;

public class ProcessaEventos {
    public static void processarEventos(String s, ListaDePropostas listaDePropostas) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
        stringTokenizer.nextToken();
        String esquema = stringTokenizer.nextToken();
        String acao = stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        String idProposta = stringTokenizer.nextToken();
        if (esquema.equals("proposal")) {
            ProcessaEventosDeProposta.processa(acao, idProposta, listaDePropostas, stringTokenizer);
        }
        if (esquema.equals("warranty")) {
            ProcessaEventosDeImovelGarantia.processa(acao, idProposta, listaDePropostas, stringTokenizer);
        }
        if (esquema.equals("proponent")) {
            ProcessaEventosDeProponente.processa(acao, idProposta, listaDePropostas, stringTokenizer);
        }
    }
}
