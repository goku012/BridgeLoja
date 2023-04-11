public abstract class Loja{

    protected Cliente cliente;

    protected float valorBase;

    public Loja(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularDesconto();
}