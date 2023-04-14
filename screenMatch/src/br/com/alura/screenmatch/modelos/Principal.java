package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinuto(180);
        System.out.println("Duração do Filme: " +  meuFilme.getDuracaoEmMinuto());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2018);
        lost.setTemporadas(7);
        lost.setAtiva(true);
        lost.setEpisodiosPorTemporada(5);
        lost.setMinutosPorEpisodio(45);
        lost.exibiFichaTecnica();
        System.out.println("Duração para Maratonar Lost: " +  lost.getDuracaoEmMinuto());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Velozes Furiosos");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinuto(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}