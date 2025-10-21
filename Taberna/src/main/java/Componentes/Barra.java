
package Componentes;

import Events.PedidoRealizadoEvent;
import com.mycompany.taberna.EventBus;
import Events.*;

public class Barra {
    private final EventBus bus;

    public Barra(EventBus bus) {
        this.bus = bus;
        bus.suscribir(PedidoRealizadoEvent.class, this::procesarPedido);
    }

    private void procesarPedido(PedidoRealizadoEvent e) {
        e.items().stream()
                .filter(item -> item.toLowerCase().contains("cerveza") || item.toLowerCase().contains("vino"))
                .forEach(bebida -> {
                    new Thread(() -> {
                        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
                        System.out.println("[Barra] Bebida servida: " + bebida + " para mesa " + e.mesaId());
                        bus.publicar(new BebidaServidaEvent(e.mesaId(), bebida));
                    }).start();
                });
    }
}

