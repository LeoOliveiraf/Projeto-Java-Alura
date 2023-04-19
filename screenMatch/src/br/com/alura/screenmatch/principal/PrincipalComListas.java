package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Velozes Furiosos", 2023);
        outroFilme.avalia(6);
        Filme filmePaulo = new Filme("Dogville", 2003);
        filmePaulo.avalia(10);
        Serie lost = new Serie("Lost", 2018);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmePaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " +  filme.getClassificacao());
        }
    }
}
