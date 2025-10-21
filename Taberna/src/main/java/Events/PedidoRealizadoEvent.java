
package Events;

import java.util.List;

public class PedidoRealizadoEvent {

    private final int mesaId;
    private final int pedidoId;
    private final List<String> items;

    public PedidoRealizadoEvent(int mesaId, int pedidoId, List<String> items) {
        this.mesaId = mesaId;
        this.pedidoId = pedidoId;
        this.items = items;
    }

    public int getMesaId() {
        return mesaId;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public List<String> getItems() {
        return items;
    }
}
