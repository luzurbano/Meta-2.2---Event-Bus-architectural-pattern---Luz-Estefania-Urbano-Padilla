
package Componentes;

import EventBus.EventBus;
import Events.*;

public class Cocina {

    private final EventBus bus;

    public Cocina(EventBus bus) {
        this.bus = bus;
        bus.suscribir(PedidoRealizadoEvent.class, this::procesarPedido);
    }

    private void procesarPedido(PedidoRealizadoEvent e) {
        e.getItems().stream()
                .filter(item -> item.toLowerCase().contains("hamburguesa") || item.toLowerCase().contains("taco"))
                .forEach(plato -> {
                    new Thread(() -> {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ignored) {
                        }
                        System.out.println("[Cocina] Comida preparada: " + plato + " del pedido " + e.getPedidoId());
                        bus.publicar(new ComidaPreparadaEvent(e.getPedidoId(), plato));
                    }).start();
                });
    }
}