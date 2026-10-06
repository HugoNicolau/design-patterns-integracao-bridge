package padroesestruturais.integracao;

public class CanalWhatsApp implements Canal {

    private CanalWhatsApp() {};
    private static CanalWhatsApp instance = new CanalWhatsApp();
    public static CanalWhatsApp getInstance() {
        return instance;
    }

    public String enviar(String destino, String mensagem) {
        return "[WhatsApp para " + destino + "] " + mensagem;
    }
}
