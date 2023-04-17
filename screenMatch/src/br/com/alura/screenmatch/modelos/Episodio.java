package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int totalVisualiza;
    private int numero;
    private String nome;
    private Serie serie;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualiza(){
        return totalVisualiza;
    }
    public void setTotalVisualiza(int totalVisualiza){
        this.totalVisualiza = totalVisualiza;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualiza > 100){
            return 4;
        }
        return 2;
    }
}
