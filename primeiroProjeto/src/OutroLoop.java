import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int contador = 0;
        while (nota != -1) {
            System.out.println("Diga sua Avaliaçao para o filme ou -1 para encerrar: ");
            nota = input.nextDouble();
            if(nota != -1){
                mediaAvaliacao += nota;
                contador++;
            }
        }
        System.out.println("Media de Avaliação: " + mediaAvaliacao / contador);
    }
}
