import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua Avaliaçao para o filme:");
            nota = input.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Media de Avaliação: " + mediaAvaliacao / 3);
    }
}
