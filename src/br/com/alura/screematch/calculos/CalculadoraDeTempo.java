package br.com.alura.screematch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        System.out.println("Adicionando o tempo em minutos de: "+ t.getNome());
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
