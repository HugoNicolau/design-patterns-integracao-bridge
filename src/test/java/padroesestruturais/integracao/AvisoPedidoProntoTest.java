package padroesestruturais.integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvisoPedidoProntoTest {

    @Test
    void deveNotificarPedidoProntoPorWhatsApp() {
        Canal canal = FabricaCanais.obterCanal("WhatsApp");
        AvisoPedidoPronto aviso = new AvisoPedidoPronto("Maria");
        aviso.setCanal(canal);
        aviso.setNumeroPedido(42);
        assertEquals("[WhatsApp para Maria] Seu pedido #42 está pronto para retirada!", aviso.notificar());
    }

    @Test
    void deveNotificarPedidoProntoPorEmail() {
        Canal canal = FabricaCanais.obterCanal("Email");
        AvisoPedidoPronto aviso = new AvisoPedidoPronto("joao@email.com");
        aviso.setCanal(canal);
        aviso.setNumeroPedido(43);
        assertEquals("[E-mail para joao@email.com] Seu pedido #43 está pronto para retirada!", aviso.notificar());
    }

    @Test
    void deveTrocarCanalDoAvisoPedidoPronto() {
        AvisoPedidoPronto aviso = new AvisoPedidoPronto("Maria");
        aviso.setNumeroPedido(42);
        aviso.setCanal(FabricaCanais.obterCanal("WhatsApp"));
        assertEquals("[WhatsApp para Maria] Seu pedido #42 está pronto para retirada!", aviso.notificar());
        aviso.setCanal(FabricaCanais.obterCanal("Email"));
        assertEquals("[E-mail para Maria] Seu pedido #42 está pronto para retirada!", aviso.notificar());
    }

}
