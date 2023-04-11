// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        System.out.printf("Bem-Vindo ao Screen Match \n");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de Lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media: " + media);
        //media calculada pelas 3 notas do filme

        String sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 80
                Muito Bom
                Ano de Lançamento
                """ + ano;
        System.out.println(sinopse);

        int classficacao;
        classficacao = (int) (media/ 2);
        System.out.println(classficacao);

        int temperatura = 27;
        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.println("Temperatura convertida de Celsius para Fahrenheit: " + fahrenheit);
    }
}