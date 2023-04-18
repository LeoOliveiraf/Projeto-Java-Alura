package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinuto(180);
        System.out.println("Duração do Filme: " +  meuFilme.getDuracaoEmMinuto());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2018);
        lost.setTemporadas(7);
        lost.setAtiva(true);
        lost.setEpisodiosPorTemporada(5);
        lost.setMinutosPorEpisodio(45);
        lost.exibiFichaTecnica();
        System.out.println("Duração para Maratonar Lost: " +  lost.getDuracaoEmMinuto());

        Filme outroFilme = new Filme("Velozes Furiosos", 2023);
        outroFilme.setDuracaoEmMinuto(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio  = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualiza(300);
        filtro.filtra(episodio);

        Filme filmePaulo = new Filme("Dogville", 2003);
        filmePaulo.setDuracaoEmMinuto(200);
        filmePaulo.avalia(10);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filmePaulo);
        filmes.add(meuFilme);
        filmes.add(outroFilme);
        System.out.println("Tamanho da Lista: " + filmes.size());
        System.out.println(filmes);
        System.out.println("Primeiro Filme: " + filmes.get(0).toString());

    }
}