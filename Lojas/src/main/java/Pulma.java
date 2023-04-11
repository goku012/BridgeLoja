public class Pulma extends Loja{

    private int numVendas;

    public Pulma(float valorBase) {
        super(valorBase);
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public float calcularDesconto() {
        return this.valorBase * this.numVendas - (1 + this.cliente.percentualDesconto());
    }
}