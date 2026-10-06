package padroesestruturais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaCanaisTest {

    @Test
    void deveRetornarCanalWhatsApp() {
        Canal canal = FabricaCanais.obterCanal("WhatsApp");
        assertEquals(CanalWhatsApp.getInstance(), canal);
    }

    @Test
    void deveRetornarCanalEmail() {
        Canal canal = FabricaCanais.obterCanal("Email");
        assertEquals(CanalEmail.getInstance(), canal);
    }

    @Test
    void deveRetornarSempreOMesmoCanal() {
        Canal canal1 = FabricaCanais.obterCanal("WhatsApp");
        Canal canal2 = FabricaCanais.obterCanal("WhatsApp");
        assertEquals(canal1, canal2);
    }

    @Test
    void deveRetornarExcecaoParaCanalInexistente() {
        try {
            Canal canal = FabricaCanais.obterCanal("SMS");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Canal inexistente", e.getMessage());
        }
    }

}
