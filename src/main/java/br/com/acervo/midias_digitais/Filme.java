package br.com.acervo.midias_digitais;

import br.com.acervo.Reproduzivel;
import br.com.acervo.model.Midia;

public class Filme extends Midia implements Reproduzivel {
    private int duracaoMinutos;

    public Filme(String titulo, int anoLancamento, int duracaoMinutos) {
        super(titulo, anoLancamento);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void reproduzir() {
        System.out.println("Assistindo o filme: " + getTitulo());
    }

    @Override
    public double getDuracao() {
        return this.duracaoMinutos;
    }

    public void exibirInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Duração (minutos): " + this.duracaoMinutos);
    }

    public void exibirInfo(boolean detalhado) {
        exibirInfo();
        if (detalhado) {
            System.out.println("Ótimo para uma sessão de cinema!");
        }
    }

    @Override
    public String getTipo() {
        return "Filme";
    }
}
