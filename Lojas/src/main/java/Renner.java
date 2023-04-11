public class Renner extends Loja{

    public Renner (float valorBase) {
        super(valorBase);
    }

    public float calcularDesconto() {
        return this.valorBase * (1 - this.cliente.percentualDesconto());
    }

}