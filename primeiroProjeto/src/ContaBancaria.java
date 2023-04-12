import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("Dados Iniciais do cliente:\n");
        System.out.println("Nome:     Leonardo Oliveira");
        System.out.println("Tipo Conta:       Corrente");
        double saldo = 2500;
        System.out.println("Saldo Inicial:      R$ " + saldo);
        System.out.println("********************");

        Integer opcao = 0;
        while(opcao != 4){
            System.out.println("Operações\n");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Depositar Saldo");
            System.out.println("3- Transferir Saldo");
            System.out.println("4- Sair");
            opcao = input.nextInt();
            switch (opcao){
                case 1: {
                    System.out.println("Seu saldo é de: " + saldo);
                    break;
                }
                case 2: {
                    double receber = 0;
                    System.out.println("Informe o Valor a ser Depositado:");
                    receber = input.nextDouble();
                    receber += saldo;
                    System.out.println("Saldo Atualizado com Sucesso R$" + receber);
                    break;
                }
                case 3: {
                    double transferir = 0;
                    System.out.println("Informe o valor a ser Transferido");
                    transferir = input.nextDouble();
                    if(saldo >= transferir){
                        double subtracao = saldo - transferir;
                        System.out.println("Transferencia com Sucesso, saldo Atual é R$" + subtracao);
                    }else{
                        System.out.println("Saldo Insuficiente!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Obrigado por usar Nossos Serviçõs, até logo!");
                    break;
                }
                default:{
                    System.out.println("Opção Invalida!");
                }

            }
        }

    }
}
