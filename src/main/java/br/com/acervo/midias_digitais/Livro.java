package br.com.acervo.midias_digitais;

import br.com.acervo.Reproduzivel;
import br.com.acervo.model.Midia;

public class Livro extends Midia implements Reproduzivel {
    private int numeroPaginas;

    public Livro(String titulo, int anoLancamento, int numeroPaginas) {
        super(titulo, anoLancamento);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void reproduzir() {
        // Imprime o título usando o método herdado de Midia
        System.out.println("Lendo o livro: " + getTitulo());
    }

    @Override
    public double getDuracao() {
        // Duração estimada em minutos: 0.5 minutos por página (2 páginas por minuto)
        return this.numeroPaginas * 0.5;
    }

    // Versão sem parâmetros que exibe todas as informações relevantes
    public void exibirInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Número de páginas: " + this.numeroPaginas);
        System.out.println("Duração estimada (minutos): " + getDuracao());
    }

    // Versão sobrecarregada que inclui mensagem extra quando detalhado == true
    public void exibirInfo(boolean detalhado) {
        exibirInfo();
        if (detalhado) {
            System.out.println("Recomendado para leitores ávidos!");
        }
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
}
