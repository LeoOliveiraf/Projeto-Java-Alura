public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinuto;

    void exibiFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
