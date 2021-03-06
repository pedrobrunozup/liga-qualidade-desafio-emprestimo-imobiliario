package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solucao {
	
  public static String processMessages(List<String> messages) {
      ListaDePropostas listaDePropostas = new ListaDePropostas(new ArrayList<>());
      StringBuilder propostasValidas = new StringBuilder();
      messages.forEach(s -> ProcessaEventos.processarEventos(s, listaDePropostas));
      listaDePropostas.setListaDePropostas(listaDePropostas.getListaDePropostas().stream().filter(Proposta::isPropostaValida).collect(Collectors.toList()));
      for (int i=0; i < listaDePropostas.getListaDePropostas().size();i++) {
        propostasValidas.append(listaDePropostas.getListaDePropostas().get(i).getIdProposta());
        propostasValidas.append(",");
      }
      propostasValidas.deleteCharAt(propostasValidas.lastIndexOf(","));
      return propostasValidas.toString();
  }
}
