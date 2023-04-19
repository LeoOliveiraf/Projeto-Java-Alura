import java.util.ArrayList;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private ArrayList<Compra> compras;

    public CartaoCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }else{
            return false;
        }
    }
}
