package padroesestruturais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvisoPromocaoTest {

    @Test
    void deveNotificarPromocaoPorWhatsApp() {
        Canal canal = FabricaCanais.obterCanal("WhatsApp");
        AvisoPromocao aviso = new AvisoPromocao("Maria");
        aviso.setCanal(canal);
        aviso.setDesconto(20);
        assertEquals("[WhatsApp para Maria] Hoje tem 20% de desconto em todos os combos!", aviso.notificar());
    }

    @Test
    void deveNotificarPromocaoPorEmail() {
        Canal canal = FabricaCanais.obterCanal("Email");
        AvisoPromocao aviso = new AvisoPromocao("joao@email.com");
        aviso.setCanal(canal);
        aviso.setDesconto(20);
        assertEquals("[E-mail para joao@email.com] Hoje tem 20% de desconto em todos os combos!", aviso.notificar());
    }

}
