public class Calcadao extends Loja{

    public Calcadao (float valorBase) {
        super(valorBase);
    }

    public float calcularDesconto() {
        return this.valorBase;
    }
}