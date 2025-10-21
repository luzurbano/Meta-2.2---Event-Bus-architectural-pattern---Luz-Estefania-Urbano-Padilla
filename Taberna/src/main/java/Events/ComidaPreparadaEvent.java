
package Events;

public class ComidaPreparadaEvent {

    private final int pedidoId;
    private final String plato;

    public ComidaPreparadaEvent(int pedidoId, String plato) {
        this.pedidoId = pedidoId;
        this.plato = plato;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public String getPlato() {
        return plato;
    }
}
