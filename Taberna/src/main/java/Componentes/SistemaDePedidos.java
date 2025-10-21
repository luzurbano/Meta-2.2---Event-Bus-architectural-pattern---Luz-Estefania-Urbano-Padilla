
package Componentes;

import EventBus.EventBus;
import Events.PedidoRealizadoEvent;
import java.util.List;
import java.util.Random;

public class SistemaDePedidos {
    private final EventBus bus;
    private final Random random = new Random();

    public SistemaDePedidos(EventBus bus) {
        this.bus = bus;
    }

    public void recibirPedido(int mesa, List<String> items) {
        int pedidoId = random.nextInt(1000);
        System.out.println("[Pedidos] Recibido pedido " + pedidoId + " de mesa " + mesa + ": " + items);
        bus.publicar(new PedidoRealizadoEvent(mesa, pedidoId, items));
    }
}



