
package Events;

public class BebidaServidaEvent {

    private final int mesaId;
    private final String bebida;

    public BebidaServidaEvent(int mesaId, String bebida) {
        this.mesaId = mesaId;
        this.bebida = bebida;
    }

    public int getMesaId() {
        return mesaId;
    }

    public String getBebida() {
        return bebida;
    }
}
