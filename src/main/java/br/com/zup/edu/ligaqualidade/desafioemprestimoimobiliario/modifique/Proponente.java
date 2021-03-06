package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

public class Proponente {
    private String idProponente;
    private String nome;
    private int idade;
    private float renda;
    private boolean principal;

    public Proponente(String idProponente, String nome, int idade, float renda, boolean principal) {
        this.idProponente = idProponente;
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.principal = principal;
    }

    public String getIdProponente() {
        return idProponente;
    }

    public void setIdProponente(String idProponente) {
        this.idProponente = idProponente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }
}
