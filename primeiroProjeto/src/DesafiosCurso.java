import java.util.Random;
import java.util.Scanner;

public class DesafiosCurso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberAleatorio = new Random().nextInt(100);

        System.out.println("Bem Vindo ao Advinhador! \n");

        int number = 0;
        System.out.println(numberAleatorio);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um Numero:");
            number = input.nextInt();
            if(number == numberAleatorio){
                System.out.println("Parabens voce Acertou!");
                break;
            } else if (number > numberAleatorio) {
                System.out.println("Digite um Numero Menor!");
            } else if (number < numberAleatorio) {
                System.out.println("Digite um Numero Maior!");
            }
        }
    }
}
