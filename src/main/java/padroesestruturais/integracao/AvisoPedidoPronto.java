package padroesestruturais.integracao;

public class AvisoPedidoPronto extends Aviso {

    private int numeroPedido;

    public AvisoPedidoPronto(String cliente) {
        super(cliente);
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String notificar() {
        return this.canal.enviar(this.cliente, "Seu pedido #" + this.numeroPedido + " está pronto para retirada!");
    }
}
