package tratamento;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        }catch (Exception ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExecao{
        System.out.println("Ini do metodo1");
        //try{
            metodo2();
        //}catch (ArithmeticException ex){
            //System.out.println("ArithmeticException");
        //}

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao{
        System.out.println("Ini do metodo2");

        throw new MinhaExecao("Deu Errado!");

        //System.out.println("Fim do metodo2");
    }
}
