package br.com.acervo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Midia {
    private String titulo;
    private int anoLancamento;
    private double classificacao;

    public abstract String getTipo();

    public Midia(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }
}
