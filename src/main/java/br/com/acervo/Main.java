package br.com.acervo;

import java.util.ArrayList;
import java.util.List;

import br.com.acervo.midias_digitais.Filme;
import br.com.acervo.midias_digitais.Livro;

public class Main {
    public static void main(String[] args) {
        // Instâncias (usando construtores das classes Livro e Filme)
        Livro livro1 = new Livro("Dom Casmurro", 1899, 256);
        Filme filme1 = new Filme("Interestelar", 2014, 169);

        // Outra instância (mesma assinatura de construtor, valores diferentes)
        Livro livro2 = new Livro("O Pequeno Príncipe", 1943, 96);
        Filme filme2 = new Filme("Matrix", 1999, 136);

        // Armazenando em uma lista de Reproduzivel
        List<Reproduzivel> midias = new ArrayList<>();
        midias.add(livro1);
        midias.add(filme1);
        midias.add(livro2);
        midias.add(filme2);

        // Chamando métodos específicos e sobrecarregados
        System.out.println("=== Exibindo informações detalhadas ===");
        for (Reproduzivel m : midias) {
            if (m instanceof Livro) {
                Livro l = (Livro) m;
                l.exibirInfo(); // versão simples
                l.exibirInfo(true); // versão detalhada
            } else if (m instanceof Filme) {
                Filme f = (Filme) m;
                f.exibirInfo(); // versão simples
                f.exibirInfo(true); // versão detalhada
            }

            m.reproduzir();
            System.out.println("Duração (minutos): " + m.getDuracao());
            System.out.println();
        }

        // Soma das durações
        double soma = 0.0;
        for (Reproduzivel m : midias) {
            soma += m.getDuracao();
        }
        System.out.println("Soma total das durações: " + soma + " minutos");
    }
}
