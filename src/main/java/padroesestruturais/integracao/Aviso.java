package padroesestruturais.integracao;

public abstract class Aviso {

    protected Canal canal;

    protected String cliente;

    public Aviso(String cliente) {
        this.cliente = cliente;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public abstract String notificar();
}
