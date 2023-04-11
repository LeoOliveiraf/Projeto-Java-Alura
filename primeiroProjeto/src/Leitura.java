import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = input.nextLine();

        System.out.println("Ano de lançamento Filme:");
        int anoLancamento = input.nextInt();

        System.out.println("Diga sua Avaliaçao para o filme:");
        double avaliacao = input.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}
