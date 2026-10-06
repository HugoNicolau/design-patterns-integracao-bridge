package padroesestruturais.integracao;

public class FabricaCanais {

    public static Canal obterCanal(String canal) {
        if ("WhatsApp".equals(canal)) {
            return CanalWhatsApp.getInstance();
        }
        if ("Email".equals(canal)) {
            return CanalEmail.getInstance();
        }
        throw new IllegalArgumentException("Canal inexistente");
    }
}
