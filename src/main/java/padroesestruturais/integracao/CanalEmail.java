package padroesestruturais.integracao;

public class CanalEmail implements Canal {

    private CanalEmail() {};
    private static CanalEmail instance = new CanalEmail();
    public static CanalEmail getInstance() {
        return instance;
    }

    public String enviar(String destino, String mensagem) {
        return "[E-mail para " + destino + "] " + mensagem;
    }
}
