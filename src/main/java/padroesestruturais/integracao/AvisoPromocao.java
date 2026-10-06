package padroesestruturais.integracao;

public class AvisoPromocao extends Aviso {

    private int desconto;

    public AvisoPromocao(String cliente) {
        super(cliente);
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public String notificar() {
        return this.canal.enviar(this.cliente, "Hoje tem " + this.desconto + "% de desconto em todos os combos!");
    }
}
