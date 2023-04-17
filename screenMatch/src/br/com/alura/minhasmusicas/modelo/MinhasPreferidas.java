package br.com.alura.minhasmusicas.modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é condiserado Sucesso!");
        }else{
            System.out.println(audio.getTitulo() + " todo mundo esta curtindo!");
        }
    }

}
