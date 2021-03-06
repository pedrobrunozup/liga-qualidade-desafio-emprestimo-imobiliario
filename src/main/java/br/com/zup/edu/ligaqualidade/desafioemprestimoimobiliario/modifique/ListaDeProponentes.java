package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.List;
import java.util.stream.Collectors;

public class ListaDeProponentes {
    private List<Proponente> proponenteList;

    public ListaDeProponentes(List<Proponente> proponenteList) {
        this.proponenteList = proponenteList;
    }

    public void adicionarProponente(String idProponente, String nome, int idade, float renda, boolean principal) {
        this.proponenteList.add(new Proponente(idProponente, nome, idade, renda, principal));
    }

    public boolean isListaDeProponentesValida() {
        if (this.proponenteList.size() < 2) {
            return  false;
        }
        if (this.proponenteList.stream()
                .filter(Proponente::isPrincipal)
                .collect(Collectors.toList()).size() > 1 ||
            this.proponenteList.stream()
                    .filter(proponente -> proponente.getIdade() < 18)
                    .collect(Collectors.toList()).size() > 0) {
            return false;
        }
        return true;
    }
}
