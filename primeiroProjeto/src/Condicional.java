public class Condicional {
    public static void main(String[] args) {
        int ano = 1996;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String tipoPlano = "plus";

        if(ano >= 2022){
            System.out.println("Lançamento que os Clientes estão Curtindo!");
        }else {
            System.out.println("Filme retrô, vale a pena Assistir!");
        }

        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Deve Pagar a locação!");
        }
    }
}
