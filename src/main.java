import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.exercicios.modelos.Aluno;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia( 7);
        meuFilme.avalia( 3);
        meuFilme.avalia( 10);
        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.getTotalDeAvaliacoes());


        Serie novaSerie = new Serie();
        novaSerie.setNome("Lost");
        novaSerie.setTemporadas(10);
        novaSerie.setEpisodiosPorTemporada(10);
        novaSerie.setMinutosPorEpisodio(50);

        System.out.println("Quanto tempo para maratonar (em minutos): "+ novaSerie.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);

        System.out.println(calculadora.getTempoTotal());


        calculadora.inclui(meuFilme);

        System.out.println("Tempo para aproveitar a lista: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Filme filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("DogView");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);
        filmeDoPaulo.setAnoDeLancamento(2003);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista:  " +listaDeFilmes.size());
        System.out.println("Primeiro filma:  " + listaDeFilmes.get(0).getNome());



    }
}
